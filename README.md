## BaseMVP
BaseMVP: MVP模式的基本框架,从Ribble开源项目中剥离.使用了 `AAC(Android Architecture Components)` 和 `MVP` 结合使用的思想.让 Lifecycle 来管理 `Presenter`.
> 参考:[Ribble](https://github.com/EasonJo/Ribble)
## CommonLib
常用的一些 Code 模板以及工具类.
### adapter
* 针对 RecycleView.Adapter 的通用封装.
* 使用 DiffUtil 来处理数据,提高刷新效率.
### extensions
Kotlin 中一些工具类性质的扩展函数.

### Imageloader
从 MVParms 中剥离  
使用策略模式,封装图片加载的逻辑,不具体定义使用什么框架来实现图片加载,默认使用了 Glide. 此设计结构可以很好剥离图片加载的业务层.