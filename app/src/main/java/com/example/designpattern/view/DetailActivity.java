package com.example.designpattern.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.designpattern.R;
import com.example.designpattern.contract.DetailViewContract;
import com.example.designpattern.databinding.ActivityDetailBinding;
import com.example.designpattern.model.GitHubService;
import com.example.designpattern.viewmodel.DetailViewModel;
import com.google.android.material.snackbar.Snackbar;

/**
 * 상세 화면을 표시하는 액티비티
 */
public class DetailActivity extends AppCompatActivity implements DetailViewContract {
    private static final String EXTRA_FULL_REPOSITORY_NAME = "EXTRA_FULL_REPOSITORY_NAME";
    private String fullRepoName;

    /**
     * DetailActivity를 시작하는 메소드
     * @param fullRepositoryName 표시하고 싶은 리포지토리 이름(google/iosched 등)
     */
    public static void start(Context context, String fullRepositoryName) {
        final Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTRA_FULL_REPOSITORY_NAME, fullRepositoryName);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        final GitHubService gitHubService = ((NewGitHubReposApplication) getApplication()).getGitHubService();
        final DetailViewModel detailViewModel = new DetailViewModel((DetailViewContract) this, gitHubService);
        binding.setViewModel(detailViewModel);

        final Intent intent = getIntent();
        fullRepoName = intent.getStringExtra(EXTRA_FULL_REPOSITORY_NAME);
        detailViewModel.loadRepositories();
    }

    @Override
    public String getFullRepositoryName() {
        return fullRepoName;
    }


    /**
     * @throws Exception
     */
    @Override
    public void startBrowser(String url) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

    @Override
    public void showError(String message) {
        Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG)
                .show();
    }

}
