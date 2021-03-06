# amazon-sp-api
amazon sp api java sdk
背景：

    亚马逊(amazon)在2020年10月推出了新的替代mws的api方案，称为Selling Partner API(SP-API)。sp-api在修改原mws的接口方式的基础上引入了aws的IAM权限管理，增加了开发者的对接门坎和学习成本。这里整理了一份java版的对接信息，供大家借鉴

MWS:

       对接的文档介绍document: http://docs.developer.amazonservices.com/en_US/dev_guide/index.html  

       sdk library: https://developer.amazonservices.com/javaclients

SP-API(amazon selling partner api):

       对接文档介绍document: https://developer.amazonservices.com/

       GitHub: https://github.com/amzn/selling-partner-api-docs

       models: https://github.com/amzn/selling-partner-api-models/

       动手训练营：https://www.spapi.org.cn/cn/intro.html    （这个动手训练营里都是干货，里面介绍了怎么做对接初步准备工作等）

       java版本的client端sdk：https://github.com/penghaiping/selling-partner-sdk


MWS与SP-API的区别：

       1.SP-API是rest方式，mws是特殊的结构有xml也有xsd
       2.SP-API授权利用了LWA，即Amazon对OAuth 2.0的实现。该模型消除了Amazon MWS所要求的手工交换认证令牌(mwsAuthToken)的需要
       3.SP-API提供比Amazon MWS更好的数据访问控制。开发人员只能请求访问他们需要的数据，而销售商可以在API部分、操作或数据资源级别授予权限
       4.SP-API允许您使用AWS身份和访问管理(IAM)直接获取和管理自己的身份验证凭据。对于Amazon MWS，您可以使用特殊的注册工作流接收Amazon提供的身份验证凭证，并且通过打开与Amazon MWS支持的联系方式获得新的凭证
       5.SP-API使用AWS签名版本4进行身份验证。Amazon MWS使用签名版本2

使用说明：

       1.所有refrences相关的api的调用类都在src/main/java/com/amazon/spapi/api
       2.所有refrences相关的api的调用测试类都在src/test/java/com/amazon/spapi/api
       3.sellersApiTest写了个测试调用类，可参考
       4.所有md文档，包括api文档及models文档都在docs文件目录下
       5.在FeedApi及reportApi中上传和下载文件的工具类在documents目录下，里面是amazon提供的java case，包含了加解密

对你有用的话，请penghp喝杯咖啡吧：
    
   <img src="https://github.com/penghaiping/selling-partner-sdk/blob/master/images/微信.jpg" width="200" height="200"/>     <img src="https://github.com/penghaiping/selling-partner-sdk/blob/master/images/支付宝.jpg" width="200" height="200"/>
