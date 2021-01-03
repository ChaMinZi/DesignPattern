# Design Pattern
#### 1. 생성에 관련된 패턴
* [Builder](Builder/explanation.md)
* [Factory Method](FactoryMethod/explanation.md)
* Prototype
* Singleton

#### 2. 구조에 관한 패턴
* [Adapter](Adapter/explanation.md)
* Bridge
* Composite
* Decorator
* Facade
* Flyweight
* Proxy
    
#### 3. 동작에 관한 패턴
* Chain of Responsibility
* Command
* Interpreter
* Iterator
* Mediator
* Memento
* Observer
* State
* Strategy
* Template Method
* Visitor


-------------------
# Architectural pattern

MVC, MVP, MVVM pattern에 대해 공부하며 작성한 repository입니다.

해당 repository에 있는 코드들은 <https://github.com/wikibook/advanced-android-book> 을 기반으로 재작성한 코드입니다.



<img src="https://user-images.githubusercontent.com/29828988/87517622-11055400-c6ba-11ea-9dc1-9aa22cef1230.jpg" width="30%"></img>
<img src="https://user-images.githubusercontent.com/29828988/87517627-1367ae00-c6ba-11ea-8e23-8cab1f765c30.jpg" width="30%"></img>
<img src="https://user-images.githubusercontent.com/29828988/87517634-15317180-c6ba-11ea-9b30-87a538a0d419.jpg" width="30%"></img>
<img src="https://user-images.githubusercontent.com/29828988/87517637-18c4f880-c6ba-11ea-8fdc-56f0605840a4.jpg" width="30%"></img>
<img src="https://user-images.githubusercontent.com/29828988/87517639-19f62580-c6ba-11ea-9a18-c874496a8d45.jpg" width="30%"></img>

# 1.구조
1.1 MVC
-------------
<img src="https://user-images.githubusercontent.com/29828988/87524520-39458080-c6c3-11ea-9386-9b53850bb779.png"></img>


1.2 MVP
-------------
<img src="https://user-images.githubusercontent.com/29828988/87529055-61d07900-c6c9-11ea-857b-287e5e5195ab.png"></img>


* ### DetailActivity를 띄우는 과정
1. RepositoryListPresenter에서 어떤 Item이 선택되었는지 확인
2. RepositoryListPresenter 내부의 변수를 통해 RepositoryListActivity의 startDetailActivity를 호출


    - [ RepositoryListPresneter ]
<pre>
<code>
    @Override
    public void selectRepositoryItem(GitHubService.RepositoryItem item) {
        repositoryListView.startDetailActivity(item.full_name);
    }
</code>
</pre>

3. DetailActivity view가 화면에 보임


    - [ RepositoryLitActivity ]
<pre>
<code>
    @Override
    public void startDetailActivity(String fullRepositoryName) {
        DetailActivity.start(this, fullRepositoryName);
    }
</code>
</pre>


1.3 MVVM
-------------
