# 今日内容
- JQuery基础
    - 概念
    - 快速入门
    - JQuery对象和JS对象的区别和转换
    - 选择器
    - DOM操作
    - 案例
    
## JQuery基础
- 概念：一个JavaScript框架，简化JS开发
    jQuery是一个快速、简洁的JavaScript框架，是继Prototype之后又一个优秀的JavaScript代码库（或JavaScript框架）。
    jQuery设计的宗旨是“write Less，Do More”，即倡导写更少的代码，做更多的事情。
    它封装JavaScript常用的功能代码，提供一种简便的JavaScript设计模式，优化HTML文档操作、事件处理、动画设计和Ajax交互。
- JavaScript框架：本质上就是一些JS文件，封装了JS的原生代码

- 快速入门
    - 步骤
        - 下载JQuery
        - 版本
            - 目前jQuery有三个大版本：
            	- 1.x：兼容ie678,使用最为广泛的，官方只做BUG维护，
            		 功能不再新增。因此一般项目来说，使用1.x版本就可以了，
            		 最终版本：1.12.4 (2016年5月20日)
            	- 2.x：不兼容ie678，很少有人使用，官方只做BUG维护，
            		 功能不再新增。如果不考虑兼容低版本的浏览器可以使用2.x，
            		 最终版本：2.2.4 (2016年5月20日)
            	- 3.x：不兼容ie678，只支持最新的浏览器。除非特殊要求，
            		 一般不会使用3.x版本的，很多老的jQuery插件不支持这个版本。
            		 目前该版本是官方主要更新维护的版本。最新版本：3.2.1（2017年3月20日）
         - jquery-xxx.js 于 jquery-xxx.min.js
            - jquery-xxx.js：开发版本，给程序员看，有良好的缩进于注释，体积较大
            - jquery-xxx.min.js：生产版本，程序中使用，没有缩进，体积较少，程序加载更快
             
        - 导入JQuery的JS文件：jquery-3.3.1.min.js
        - 使用
- JQuery对象和JS对象的区别和转换
    - jquery对象在操作时，更加方便
        - JQuery对象和JS对象的方法是不通用的
        - 两者相互转换
            - jq --> js：jq对象[索引] 或 jq对象.get(索引)
            - js --> jq：$(js对象)
- 选择器
- DOM操作
- 案例