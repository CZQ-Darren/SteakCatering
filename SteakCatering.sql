#创建库
CREATE DATABASE steak_catering

# 记得选中steak_catering库，再创建表
# 创建用户信息表
CREATE TABLE steak_user(
	su_user_id 	INT PRIMARY KEY AUTO_INCREMENT,
	su_user_name 	VARCHAR(64) NOT NULL,
	su_email 	VARCHAR(64) NOT NULL,
	su_password	VARCHAR(64) NOT NULL,
	su_sex		VARCHAR(64) NOT NULL,
	su_birthday	VARCHAR(64),
	su_mobile	VARCHAR(64),
	su_img		VARCHAR(64),
	su_create_time	VARCHAR(64),
	su_create_user	VARCHAR(64),
	su_update_time	VARCHAR(64),
	su_update_user	VARCHAR(64),
	su_status	INT NOT NULL  #1.普通用户，2.管理员
);



# 创建菜品信息表
CREATE TABLE steak_dish(
	sd_dish_id 	INT PRIMARY KEY AUTO_INCREMENT,
	sd_dish_name	VARCHAR(64) NOT NULL,
	sd_dish_price	DOUBLE(7,1) NOT NULL,
	sd_dish_content	VARCHAR(512) NOT NULL,
	sdc_id		INT NOT NULL,
	sd_img		VARCHAR(64) NOT NULL,
	sd_create_time	VARCHAR(64),
	sd_create_user	VARCHAR(64),
	sd_update_time	VARCHAR(64),
	sd_update_user	VARCHAR(64),
	reserve1	VARCHAR(64), #备用字段
	reserve2	VARCHAR(64), #备用字段
	reserve3	VARCHAR(64)  #备用字段
);

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('海鲜芝士大虾',49,'拿出即可鱼和虾，绝对是年夜饭的明星了吧。
一整条鱼，不能缺少一点，寓意年年有余。每人一只烧的红润油亮的虾，
红红的虾油代表鸿运当头。小时候家里不富裕，每年年夜饭，都是一人一只虾。
作为小孩子的我们，其实特别想吃那个最大的，但是也要按着爸爸妈妈的指挥，
把最大的虾夹给爷爷奶奶，然后是爸爸妈妈，最后才是自己的。',6,
'ms-pic1.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('草莓布丁杯',12,'中世纪”布丁”似乎是肉制的，不过在《文艺复兴的教父》一书中，
曾提到法国王后凯瑟琳·德·美第奇从家乡托斯卡纳带来了意大利厨师，这些厨师改革了
法国宫廷的餐桌，带来了意大利的厨艺理念，并带来了甜品布丁和冰淇淋，由此推测布丁
应该来源于文艺复兴时期的意大利。',4,
'ms-pic2.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('菲力黑椒牛排',69,'菲力牛排，就是用一定厚度的牛里脊肉做出的牛排。菲力指的
是牛里脊肉（beef tenderloin）。在澳洲，这块肉被称为“眼菲力”，在法国和英国被称为
filet和fillet，中文音译菲力。很多人认为牛排最早是西方人的美食，在欧洲中世纪的时候
就开始出现了，牛排只有贵族才可以吃到的美食，而猪肉和羊肉只有平常百姓才可以吃到的，
牛肉是贵族的象征，想要吃到牛排除非得到国王的赏识或者立下过过劳的战士才有机会吃到的。
尊贵的牛肉被他们搭配上了当时也是享有尊贵身份的胡椒及香辛料一起烹调，并在特殊场合
中供应，以彰显主人的尊贵身份。到了18世纪，英国已经成了著名的牛肉食用大国。',1,
'ms-pic3.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('香煎排意面',69,'鸡胸肉从中剖开，平铺装进保鲜袋后，用厨用锤子（有人用锅，呵呵）
锤成相等厚度备用；锅开中火放入橄榄油和黄油（溶化的温度即可）；面粉加些盐和胡椒略
拌，把鸡肉均匀沾上面粉，拎起抖落多余的粉，然后下过煎至金黄拿出；加入鸡高汤和
葡萄酒，转中小火，酸豆用水略冲后放入；柠檬从中切开，切下2-3片留着装饰用，
剩下的将汁挤进锅中，再将柠檬连皮扔进去略煮再捞出；最后将煎好的鸡排放进去稍煮，
让它们更入味，再将之取出，将汤汁略收；如果准备了意面，此时将意面放进去；最后将
意面装盘，将鸡排放上，最后浇上汤汁，放上柠檬片装饰即可。',2,
'ms-pic4.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('鲜香培根比萨',59,'比萨饼来源于中国。当年意大利著名旅行家马可·波罗
在中国旅行时最喜欢吃一种中国北方流行的葱油馅饼。回到意大利后他一直想能够再次品尝，
但却不会烤制。一次，他同朋友们在家中聚会，其中一位是来自那波里的厨师，马可·波罗
灵机一动，把那位厨师叫到身边，如此这般地描绘起中国的香葱馅饼来。那位厨师也兴致勃勃
地按马可·波罗所描绘的方法制作起来，可忙乎了半天，仍无法将馅料放入面团’中。
此时已近下午两点，大家饥肠辘辘。于是马可·波罗提议：索性把馅料放在面饼上吃。
大家吃后，都齐声叫好。这位厨师回到那波里后又做了几次，并配上了那波里的奶酪和作料，
没想到大受食客们的欢迎，从此“比萨”就流传开了。',3,
'ms-pic5.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('番茄烩意面',39,'番茄红烩意面，是一道面食，制作原料主要有意大利面、
牛肉馅等。',2,'ms-pic6.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('海鲜芝士大虾加量版',79,'拿出即可鱼和虾，绝对是年夜饭的明星了吧。
一整条鱼，不能缺少一点，寓意年年有余。每人一只烧的红润油亮的虾，
红红的虾油代表鸿运当头。小时候家里不富裕，每年年夜饭，都是一人一只虾。
作为小孩子的我们，其实特别想吃那个最大的，但是也要按着爸爸妈妈的指挥，
把最大的虾夹给爷爷奶奶，然后是爸爸妈妈，最后才是自己的。',6,
'ms-pic1.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('草莓布丁杯加量版',32,'中世纪”布丁”似乎是肉制的，不过在《文艺复兴的教父》一书中，
曾提到法国王后凯瑟琳·德·美第奇从家乡托斯卡纳带来了意大利厨师，这些厨师改革了
法国宫廷的餐桌，带来了意大利的厨艺理念，并带来了甜品布丁和冰淇淋，由此推测布丁
应该来源于文艺复兴时期的意大利。',4,
'ms-pic2.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('菲力黑椒牛排加量版',119,'菲力牛排，就是用一定厚度的牛里脊肉做出的牛排。菲力指的
是牛里脊肉（beef tenderloin）。在澳洲，这块肉被称为“眼菲力”，在法国和英国被称为
filet和fillet，中文音译菲力。很多人认为牛排最早是西方人的美食，在欧洲中世纪的时候
就开始出现了，牛排只有贵族才可以吃到的美食，而猪肉和羊肉只有平常百姓才可以吃到的，
牛肉是贵族的象征，想要吃到牛排除非得到国王的赏识或者立下过过劳的战士才有机会吃到的。
尊贵的牛肉被他们搭配上了当时也是享有尊贵身份的胡椒及香辛料一起烹调，并在特殊场合
中供应，以彰显主人的尊贵身份。到了18世纪，英国已经成了著名的牛肉食用大国。',1,
'ms-pic3.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('番茄烩意面加量版',59,'番茄红烩意面，是一道面食，制作原料主要有意大利面、
牛肉馅等。',2,'ms-pic6.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('海鲜芝士大虾加量版',99,'拿出即可鱼和虾，绝对是年夜饭的明星了吧。
一整条鱼，不能缺少一点，寓意年年有余。每人一只烧的红润油亮的虾，
红红的虾油代表鸿运当头。小时候家里不富裕，每年年夜饭，都是一人一只虾。
作为小孩子的我们，其实特别想吃那个最大的，但是也要按着爸爸妈妈的指挥，
把最大的虾夹给爷爷奶奶，然后是爸爸妈妈，最后才是自己的。',6,
'ms-pic1.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('草莓布丁杯超级加量版',112,'中世纪”布丁”似乎是肉制的，不过在《文艺复兴的教父》一书中，
曾提到法国王后凯瑟琳·德·美第奇从家乡托斯卡纳带来了意大利厨师，这些厨师改革了
法国宫廷的餐桌，带来了意大利的厨艺理念，并带来了甜品布丁和冰淇淋，由此推测布丁
应该来源于文艺复兴时期的意大利。',5,
'ms-pic2.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('菲力黑椒牛排超级加量版',169,'菲力牛排，就是用一定厚度的牛里脊肉做出的牛排。菲力指的
是牛里脊肉（beef tenderloin）。在澳洲，这块肉被称为“眼菲力”，在法国和英国被称为
filet和fillet，中文音译菲力。很多人认为牛排最早是西方人的美食，在欧洲中世纪的时候
就开始出现了，牛排只有贵族才可以吃到的美食，而猪肉和羊肉只有平常百姓才可以吃到的，
牛肉是贵族的象征，想要吃到牛排除非得到国王的赏识或者立下过过劳的战士才有机会吃到的。
尊贵的牛肉被他们搭配上了当时也是享有尊贵身份的胡椒及香辛料一起烹调，并在特殊场合
中供应，以彰显主人的尊贵身份。到了18世纪，英国已经成了著名的牛肉食用大国。',1,
'ms-pic3.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('香煎排意面加量版',99,'鸡胸肉从中剖开，平铺装进保鲜袋后，用厨用锤子（有人用锅，呵呵）
锤成相等厚度备用；锅开中火放入橄榄油和黄油（溶化的温度即可）；面粉加些盐和胡椒略
拌，把鸡肉均匀沾上面粉，拎起抖落多余的粉，然后下过煎至金黄拿出；加入鸡高汤和
葡萄酒，转中小火，酸豆用水略冲后放入；柠檬从中切开，切下2-3片留着装饰用，
剩下的将汁挤进锅中，再将柠檬连皮扔进去略煮再捞出；最后将煎好的鸡排放进去稍煮，
让它们更入味，再将之取出，将汤汁略收；如果准备了意面，此时将意面放进去；最后将
意面装盘，将鸡排放上，最后浇上汤汁，放上柠檬片装饰即可。',2,
'ms-pic4.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('鲜香培根比萨超级加量版',159,'比萨饼来源于中国。当年意大利著名旅行家马可·波罗
在中国旅行时最喜欢吃一种中国北方流行的葱油馅饼。回到意大利后他一直想能够再次品尝，
但却不会烤制。一次，他同朋友们在家中聚会，其中一位是来自那波里的厨师，马可·波罗
灵机一动，把那位厨师叫到身边，如此这般地描绘起中国的香葱馅饼来。那位厨师也兴致勃勃
地按马可·波罗所描绘的方法制作起来，可忙乎了半天，仍无法将馅料放入面团’中。
此时已近下午两点，大家饥肠辘辘。于是马可·波罗提议：索性把馅料放在面饼上吃。
大家吃后，都齐声叫好。这位厨师回到那波里后又做了几次，并配上了那波里的奶酪和作料，
没想到大受食客们的欢迎，从此“比萨”就流传开了。',3,
'ms-pic5.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('番茄烩意面升级版',139,'番茄红烩意面，是一道面食，制作原料主要有意大利面、
牛肉馅等。',2,'ms-pic6.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('海鲜芝士大虾升级版',109,'拿出即可鱼和虾，绝对是年夜饭的明星了吧。
一整条鱼，不能缺少一点，寓意年年有余。每人一只烧的红润油亮的虾，
红红的虾油代表鸿运当头。小时候家里不富裕，每年年夜饭，都是一人一只虾。
作为小孩子的我们，其实特别想吃那个最大的，但是也要按着爸爸妈妈的指挥，
把最大的虾夹给爷爷奶奶，然后是爸爸妈妈，最后才是自己的。',6,
'ms-pic1.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('草莓布丁杯升级版',132,'中世纪”布丁”似乎是肉制的，不过在《文艺复兴的教父》一书中，
曾提到法国王后凯瑟琳·德·美第奇从家乡托斯卡纳带来了意大利厨师，这些厨师改革了
法国宫廷的餐桌，带来了意大利的厨艺理念，并带来了甜品布丁和冰淇淋，由此推测布丁
应该来源于文艺复兴时期的意大利。',4,
'ms-pic2.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('菲力黑椒牛排升级版',219,'菲力牛排，就是用一定厚度的牛里脊肉做出的牛排。菲力指的
是牛里脊肉（beef tenderloin）。在澳洲，这块肉被称为“眼菲力”，在法国和英国被称为
filet和fillet，中文音译菲力。很多人认为牛排最早是西方人的美食，在欧洲中世纪的时候
就开始出现了，牛排只有贵族才可以吃到的美食，而猪肉和羊肉只有平常百姓才可以吃到的，
牛肉是贵族的象征，想要吃到牛排除非得到国王的赏识或者立下过过劳的战士才有机会吃到的。
尊贵的牛肉被他们搭配上了当时也是享有尊贵身份的胡椒及香辛料一起烹调，并在特殊场合
中供应，以彰显主人的尊贵身份。到了18世纪，英国已经成了著名的牛肉食用大国。',1,
'ms-pic3.jpg','2021-01-14','aaa');

INSERT steak_dish(sd_dish_name,sd_dish_price,sd_dish_content,sdc_id,sd_img,
sd_create_time,sd_create_user)
VALUES('番茄烩意面升级版',159,'番茄红烩意面，是一道面食，制作原料主要有意大利面、
牛肉馅等。',2,'ms-pic6.jpg','2021-01-14','aaa');




# 创建菜品分类表
CREATE TABLE steak_dish_category(
	sdc_id		INT PRIMARY KEY AUTO_INCREMENT,
	sdc_name	VARCHAR(64) NOT NULL
);

INSERT steak_dish_category(sdc_name) VALUES('经典牛排'),('意面/烩饭'),('风味披萨'),
('甜品小食'),('酒水饮料'),('其他');




# 创建店面信息表
CREATE TABLE steak_store(
	ss_store_id	INT PRIMARY KEY AUTO_INCREMENT,
	ss_store_name	VARCHAR(64) NOT NULL,
	ss_content	VARCHAR(512) NOT NULL,
	ss_img		VARCHAR(64) NOT NULL,
	ssc_id		INT NOT NULL,
	reserve1	VARCHAR(64), #备用字段
	reserve2	VARCHAR(64), #备用字段
	reserve3	VARCHAR(64)  #备用字段
);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('北京朝阳区店','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 300元左右 包间数量： 3%分隔%有停车位 支付方式： 现金、刷卡
%分隔%北京市朝阳区朝阳门西大街一号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic3.jpg
%分隔%shop-pic7.jpg',1);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('北京朝阳区店2','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 300元左右 包间数量： 3%分隔%有停车位 支付方式： 现金、刷卡
%分隔%北京市朝阳区朝阳门西大街二号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic1.jpg
%分隔%about-pic3.jpg',1);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('北京朝阳区店3','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 300元左右 包间数量： 3%分隔%有停车位 支付方式： 现金、刷卡
%分隔%北京市朝阳区朝阳门西大街三号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic5.jpg
%分隔%about-pic5.jpg',1);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('北京朝阳区店4','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 300元左右 包间数量： 3%分隔%有停车位 支付方式： 现金、刷卡
%分隔%北京市朝阳区朝阳门西大街四号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic4.jpg
%分隔%about-pic2.jpg',1);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('上海朝阳区店1','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 500元左右 包间数量： 5%分隔%有停车位 支付方式： 现金、刷卡
%分隔%上海市朝阳区朝阳门西大街一号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic6.jpg
%分隔%about-pic4.jpg',2);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('上海朝阳区店2','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 500元左右 包间数量： 5%分隔%有停车位 支付方式： 现金、刷卡
%分隔%上海市朝阳区朝阳门西大街二号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic2.jpg
%分隔%about-pic2.jpg',2);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('上海朝阳区店3','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 500元左右 包间数量： 5%分隔%有停车位 支付方式： 现金、刷卡
%分隔%上海市朝阳区朝阳门西大街三号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic3.jpg
%分隔%about-pic3.jpg',2);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('上海朝阳区店4','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 500元左右 包间数量： 5%分隔%有停车位 支付方式： 现金、刷卡
%分隔%上海市朝阳区朝阳门西大街四号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic4.jpg
%分隔%about-pic4.jpg',2);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('上海朝阳区店5','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 500元左右 包间数量： 5%分隔%有停车位 支付方式： 现金、刷卡
%分隔%上海市朝阳区朝阳门西大街五号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic5.jpg
%分隔%about-pic5.jpg',2);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('厦门朝阳区店','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 400元左右 包间数量： 4%分隔%有停车位 支付方式： 现金、刷卡
%分隔%厦门市朝阳区朝阳门西大街一号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic6.jpg
%分隔%about-pic2.jpg',3);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('厦门朝阳区店2','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 400元左右 包间数量： 4%分隔%有停车位 支付方式： 现金、刷卡
%分隔%厦门市朝阳区朝阳门西大街二号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic2.jpg
%分隔%about-pic5.jpg',3);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('厦门朝阳区店3','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 400元左右 包间数量： 4%分隔%有停车位 支付方式： 现金、刷卡
%分隔%厦门市朝阳区朝阳门西大街三号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic4.jpg
%分隔%about-pic4.jpg',3);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('广州朝阳区店','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 200元左右 包间数量： 3%分隔%有停车位 支付方式： 现金、刷卡
%分隔%广州市朝阳区朝阳门西大街一号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic1.jpg
%分隔%about-pic5.jpg',4);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('广州朝阳区店2','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 200元左右 包间数量： 3%分隔%有停车位 支付方式： 现金、刷卡
%分隔%广州市朝阳区朝阳门西大街二号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic3.jpg
%分隔%about-pic3.jpg',4);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('深圳朝阳区店','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 250元左右 包间数量： 3%分隔%有停车位 支付方式： 现金、刷卡
%分隔%深圳市朝阳区朝阳门西大街一号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic5.jpg
%分隔%about-pic5.jpg',5);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('深圳朝阳区店','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 250元左右 包间数量： 3%分隔%有停车位 支付方式： 现金、刷卡
%分隔%深圳市朝阳区朝阳门西大街二号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic2.jpg
%分隔%about-pic2.jpg',5);

INSERT steak_store(ss_store_name,ss_content,ss_img,ssc_id)
VALUES('朝阳区店','波尔多酒鹅肝批、罐焖牛肉、勃艮第少司焗蜗牛、奶油蘑菇汤、牛扒、羊排、鹅肝酱、
龙虾%分隔%11:00-22:00 人均消费： 100元左右 包间数量： 2%分隔%有停车位 支付方式： 现金、刷卡
%分隔%朝阳区朝阳门西大街二号%分隔%法国菜,有包间,有车位,可刷卡,崇文区,地铁1号线,
地铁2号线,地铁5号线,新世界商场,新闻大厦,朋友聚会,家人就餐,谈情约会','shop-pic3.jpg
%分隔%about-pic3.jpg',6);




# 创建店面分类表
CREATE TABLE steak_store_category(
	ssc_id		INT PRIMARY KEY AUTO_INCREMENT,
	ssc_name	VARCHAR(64) NOT NULL
);

INSERT steak_store_category(ssc_name) VALUES('北京店'),('上海店'),('厦门店'),
('广州店'),('深圳店'),('其他');



# 创建新闻资讯表
CREATE TABLE steak_news(
	sn_id		INT PRIMARY KEY AUTO_INCREMENT,
	sn_title	VARCHAR(64) NOT NULL,
	sn_content	VARCHAR(1024) NOT NULL,
	sn_img		VARCHAR(64) NOT NULL,
	sn_create_time	VARCHAR(64),
	sn_create_user	VARCHAR(64),
	sn_update_time	VARCHAR(64),
	sn_update_user	VARCHAR(64),
	reserve1	VARCHAR(64), #备用字段
	reserve2	VARCHAR(64), #备用字段
	reserve3	VARCHAR(64)  #备用字段
);

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('牛排怎么分类 几成熟最好吃','牛排的分类知多少？

西冷牛排（SIRLOIN）：也叫沙朗牛排，是指肉质鲜嫩又带油花嫩筋的牛肉，基本上取自于牛背脊一带最柔嫩的牛肉，具体位置不同，风味也各有千秋。比较正宗的沙朗取自后腰脊肉，但特殊的品种例如纽约客，则是取自于类似菲力的前腰脊肉。沙朗牛排肉质鲜嫩且香甜多汁，富有口感，受入门级牛排行家所偏好。

推荐火候：四至六分熟。

菲力牛排（FILLET）：也称嫩牛柳，牛里脊（TENDERLOIN)，取自于牛的里肌肉（即腰内肉），运动量少，且肉质最嫩精瘦，油脂少，因每头牛就一小条而显得「物稀为贵」。口感好但没有嚼头，并且烹煮过头就显得老涩，因此多推荐给牙口不好，消化较弱的老人家或小朋友食用。

推荐火候：三至七分熟。

丁骨牛排(T BONE)：是牛背上的脊骨肉，大块肉排中间夹着 T 字形的大骨,一边是菲力,一边是纽约客,肉质一细嫩一粗犷,或油腴或爽俐,点一客统统吃得到。

推荐火候：五至八分熟 。

肋眼牛排(RIB EYE) ：取自于牛肋脊部位，即牛骨边上的肉。肋眼牛排或许比不上腰脊肉那样嫩，但骨边肉向来好吃，油油嫩嫩的肉丝中夹着Q而有劲的油筋，比沙朗耐嚼，比菲力够味，而且油花十分丰郁，是受年轻男食客喜欢。

推荐火候：四至六分熟。

牛小排：牛小排取自于牛的胸腔左右两侧，含肋骨部分。牛小排带骨带筋肉质肥腴鲜美，多汁且耐嚼，有大理石纹，特别是采用牛的第六、七根肋骨的，嫩而不涩，肉量丰郁的全熟肉质，即使是怕生的食客也可怡然享用，更创造出牛小排的另类魅力。

推荐火候：全熟。

除了上述的品种，餐桌上常见的还有像牛肩胛部位的板腱肉、上肩胛肋眼心、牛肚部位的腹胁肉、上后腿肉等，这些部位虽然肉质纤维较粗，无法媲美以上品种。

 

牛排你要几成熟？

三分熟牛排，不是血淋淋的，看得到的只有一样漂亮的焦棕褐色，表面浮渗着香甜的肉汁。下刀切开后，看到的是火腿肠般的暗红色，品尝起来，入口只需轻轻嚼动便温润即化，留下满口的鲜甜馀香，这样，才是“三分熟”！

一分熟牛排（rare）：牛排内部为血红色且内部各处保持一定温度（高于very rare steak）。

三分熟牛排（medium rare）：内部为桃红且带有相当热度。

五分熟牛排（medium）：牛排内部为粉红且夹杂着浅灰和综褐色，整个牛排都很烫。

七分熟牛排（medium well）：牛排内部主要为浅灰综褐色，夹杂着粉红色。

全熟牛排（well done）：牛排内部为褐色。','news-pic5.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('烤鸭的由来','烤鸭是具有世界声誉的北京著名菜式，起源于中国南北朝时期，
《食珍录》中已记有炙鸭，在当时是宫廷食品。用料为优质肉食鸭北京鸭，果木炭火烤制，
色泽红润，肉质肥而不腻，外脆里嫩。北京烤鸭分为两大流派，而北京最著名的烤鸭店也即是两派的代表。
它以色泽红艳，肉质细嫩，味道醇厚，肥而不腻的特色，被誉为“天下美味”。',
'news-pic1.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('狮子头的由来','狮子头是中国江苏省扬州淮扬菜系中的一道传统菜肴。
传说狮子头做法始于隋朝，是在隋炀帝游幸时，厨师以扬州万松山、金钱墩、象牙林、
葵花岗四大名景为主题做成了松鼠桂鱼、金钱虾饼、象牙鸡条和葵花斩肉四道菜，据说原名葵花斩肉、
葵花肉丸，唐代郇国公韦陟的家厨韦巨元做松鼠桂鱼，金钱虾饼，象牙鸡条，葵花斩肉四道名菜，
令座中宾客叹服，葵花斩肉被改名为狮子头。此菜口感软糯滑腻，健康营养。',
'news-pic3.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('饺子的由来','饺子源于古代的角子。饺子原名“娇耳”，相传是我国医圣张仲景首先发明的，
距今已有一千八百多年的历史了。是深受中国人民喜爱的传统特色食品，又称水饺，是中国北方民间的主食和
地方小吃，也是年节食品。有一句民谣叫“大寒小寒，吃饺子过年。”饺子多用面皮包馅水煮而成。主要食材有
面皮，猪肉，羊肉，牛肉，鸡肉，鸭肉，鹅肉 ，蔬菜，酱料，蝦粉、蟹肉，佐料等。',
'news-pic2.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('狗不理包子的由来','狗不理包子是天津一道由面粉、猪肉等材料制作而成的小吃，始创于公元1858年
（清朝咸丰年间），为“天津三绝”之首，是中华老字号之一。狗不理包子的面、馅选料精细，制作工艺严格，
外形美观，特别是包子褶花匀称，每个包子都不少于15个褶。刚出笼的包子，鲜而不腻，清香适口。
狗不理包子以鲜肉包为主，兼有三鲜包、海鲜包、酱肉包、素包子等6大类、98个品种。',
'news-pic4.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('东坡肉的由来','东坡肉，又名滚肉、东坡焖肉，是眉山和江南地区特色传统名菜。
东坡肉在浙菜、川菜、鄂菜等菜系中都有，且各地做法也有不同，有先煮后烧的，有先煮后蒸的，
有直接焖煮收汁的。东坡肉的主料和造型大同小异，主料都是半肥半瘦的猪肉，成品菜都是码得整整齐齐的
麻将块儿，红得透亮，色如玛瑙，夹起一块尝尝，软而不烂，肥而不腻。',
'news-pic1.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('东坡肉的由来','火锅(Hot Pot)，古称“古董羹”，因食物投入沸水时发出的“咕咚”声而得名，
它是中国独创的美食，历史悠久，是一种老少皆宜的食物。据考证，战国时期即有火锅，时人以陶罐为锅，
到宋代，火锅的吃法在民间已十分常见，南宋林洪的《山家清供》食谱中，便有同友人吃火锅的介绍。
元代，火锅流传到蒙古一带，用来煮牛羊肉。到清代，火锅不仅在民间流行，而且成了一道著名的“宫廷菜”，
用料是山鸡等野味。

典型的火锅食材包括各种肉类、海鲜类、蔬菜类、豆制品类、菌菇类、蛋类制品等，
将其放入煮开的清水或特制的高汤锅底烫熟后食用。有些吃法还会蘸上调味料 一起食用。',
'news-pic5.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('牛排怎么分类 几成熟最好吃','牛排的分类知多少？

西冷牛排（SIRLOIN）：也叫沙朗牛排，是指肉质鲜嫩又带油花嫩筋的牛肉，基本上取自于牛背脊一带最柔嫩的牛肉，具体位置不同，风味也各有千秋。比较正宗的沙朗取自后腰脊肉，但特殊的品种例如纽约客，则是取自于类似菲力的前腰脊肉。沙朗牛排肉质鲜嫩且香甜多汁，富有口感，受入门级牛排行家所偏好。

推荐火候：四至六分熟。

菲力牛排（FILLET）：也称嫩牛柳，牛里脊（TENDERLOIN)，取自于牛的里肌肉（即腰内肉），运动量少，且肉质最嫩精瘦，油脂少，因每头牛就一小条而显得「物稀为贵」。口感好但没有嚼头，并且烹煮过头就显得老涩，因此多推荐给牙口不好，消化较弱的老人家或小朋友食用。

推荐火候：三至七分熟。

丁骨牛排(T BONE)：是牛背上的脊骨肉，大块肉排中间夹着 T 字形的大骨,一边是菲力,一边是纽约客,肉质一细嫩一粗犷,或油腴或爽俐,点一客统统吃得到。

推荐火候：五至八分熟 。

肋眼牛排(RIB EYE) ：取自于牛肋脊部位，即牛骨边上的肉。肋眼牛排或许比不上腰脊肉那样嫩，但骨边肉向来好吃，油油嫩嫩的肉丝中夹着Q而有劲的油筋，比沙朗耐嚼，比菲力够味，而且油花十分丰郁，是受年轻男食客喜欢。

推荐火候：四至六分熟。

牛小排：牛小排取自于牛的胸腔左右两侧，含肋骨部分。牛小排带骨带筋肉质肥腴鲜美，多汁且耐嚼，有大理石纹，特别是采用牛的第六、七根肋骨的，嫩而不涩，肉量丰郁的全熟肉质，即使是怕生的食客也可怡然享用，更创造出牛小排的另类魅力。

推荐火候：全熟。

除了上述的品种，餐桌上常见的还有像牛肩胛部位的板腱肉、上肩胛肋眼心、牛肚部位的腹胁肉、上后腿肉等，这些部位虽然肉质纤维较粗，无法媲美以上品种。

 

牛排你要几成熟？

三分熟牛排，不是血淋淋的，看得到的只有一样漂亮的焦棕褐色，表面浮渗着香甜的肉汁。下刀切开后，看到的是火腿肠般的暗红色，品尝起来，入口只需轻轻嚼动便温润即化，留下满口的鲜甜馀香，这样，才是“三分熟”！

一分熟牛排（rare）：牛排内部为血红色且内部各处保持一定温度（高于very rare steak）。

三分熟牛排（medium rare）：内部为桃红且带有相当热度。

五分熟牛排（medium）：牛排内部为粉红且夹杂着浅灰和综褐色，整个牛排都很烫。

七分熟牛排（medium well）：牛排内部主要为浅灰综褐色，夹杂着粉红色。

全熟牛排（well done）：牛排内部为褐色。','news-pic5.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('烤鸭的由来','烤鸭是具有世界声誉的北京著名菜式，起源于中国南北朝时期，
《食珍录》中已记有炙鸭，在当时是宫廷食品。用料为优质肉食鸭北京鸭，果木炭火烤制，
色泽红润，肉质肥而不腻，外脆里嫩。北京烤鸭分为两大流派，而北京最著名的烤鸭店也即是两派的代表。
它以色泽红艳，肉质细嫩，味道醇厚，肥而不腻的特色，被誉为“天下美味”。',
'news-pic1.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('狮子头的由来','狮子头是中国江苏省扬州淮扬菜系中的一道传统菜肴。
传说狮子头做法始于隋朝，是在隋炀帝游幸时，厨师以扬州万松山、金钱墩、象牙林、
葵花岗四大名景为主题做成了松鼠桂鱼、金钱虾饼、象牙鸡条和葵花斩肉四道菜，据说原名葵花斩肉、
葵花肉丸，唐代郇国公韦陟的家厨韦巨元做松鼠桂鱼，金钱虾饼，象牙鸡条，葵花斩肉四道名菜，
令座中宾客叹服，葵花斩肉被改名为狮子头。此菜口感软糯滑腻，健康营养。',
'news-pic3.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('饺子的由来','饺子源于古代的角子。饺子原名“娇耳”，相传是我国医圣张仲景首先发明的，
距今已有一千八百多年的历史了。是深受中国人民喜爱的传统特色食品，又称水饺，是中国北方民间的主食和
地方小吃，也是年节食品。有一句民谣叫“大寒小寒，吃饺子过年。”饺子多用面皮包馅水煮而成。主要食材有
面皮，猪肉，羊肉，牛肉，鸡肉，鸭肉，鹅肉 ，蔬菜，酱料，蝦粉、蟹肉，佐料等。',
'news-pic2.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('狗不理包子的由来','狗不理包子是天津一道由面粉、猪肉等材料制作而成的小吃，始创于公元1858年
（清朝咸丰年间），为“天津三绝”之首，是中华老字号之一。狗不理包子的面、馅选料精细，制作工艺严格，
外形美观，特别是包子褶花匀称，每个包子都不少于15个褶。刚出笼的包子，鲜而不腻，清香适口。
狗不理包子以鲜肉包为主，兼有三鲜包、海鲜包、酱肉包、素包子等6大类、98个品种。',
'news-pic4.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('东坡肉的由来','东坡肉，又名滚肉、东坡焖肉，是眉山和江南地区特色传统名菜。
东坡肉在浙菜、川菜、鄂菜等菜系中都有，且各地做法也有不同，有先煮后烧的，有先煮后蒸的，
有直接焖煮收汁的。东坡肉的主料和造型大同小异，主料都是半肥半瘦的猪肉，成品菜都是码得整整齐齐的
麻将块儿，红得透亮，色如玛瑙，夹起一块尝尝，软而不烂，肥而不腻。',
'news-pic1.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('东坡肉的由来','火锅(Hot Pot)，古称“古董羹”，因食物投入沸水时发出的“咕咚”声而得名，
它是中国独创的美食，历史悠久，是一种老少皆宜的食物。据考证，战国时期即有火锅，时人以陶罐为锅，
到宋代，火锅的吃法在民间已十分常见，南宋林洪的《山家清供》食谱中，便有同友人吃火锅的介绍。
元代，火锅流传到蒙古一带，用来煮牛羊肉。到清代，火锅不仅在民间流行，而且成了一道著名的“宫廷菜”，
用料是山鸡等野味。

典型的火锅食材包括各种肉类、海鲜类、蔬菜类、豆制品类、菌菇类、蛋类制品等，
将其放入煮开的清水或特制的高汤锅底烫熟后食用。有些吃法还会蘸上调味料 一起食用。',
'news-pic5.jpg','2021-01-11','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('饺子的由来','饺子源于古代的角子。饺子原名“娇耳”，相传是我国医圣张仲景首先发明的，
距今已有一千八百多年的历史了。是深受中国人民喜爱的传统特色食品，又称水饺，是中国北方民间的主食和
地方小吃，也是年节食品。有一句民谣叫“大寒小寒，吃饺子过年。”饺子多用面皮包馅水煮而成。主要食材有
面皮，猪肉，羊肉，牛肉，鸡肉，鸭肉，鹅肉 ，蔬菜，酱料，蝦粉、蟹肉，佐料等。',
'news-pic2.jpg','2021-01-12','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('烤鸭的由来','烤鸭是具有世界声誉的北京著名菜式，起源于中国南北朝时期，
《食珍录》中已记有炙鸭，在当时是宫廷食品。用料为优质肉食鸭北京鸭，果木炭火烤制，
色泽红润，肉质肥而不腻，外脆里嫩。北京烤鸭分为两大流派，而北京最著名的烤鸭店也即是两派的代表。
它以色泽红艳，肉质细嫩，味道醇厚，肥而不腻的特色，被誉为“天下美味”。',
'news-pic3.jpg','2021-01-10','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('狮子头的由来','狮子头是中国江苏省扬州淮扬菜系中的一道传统菜肴。
传说狮子头做法始于隋朝，是在隋炀帝游幸时，厨师以扬州万松山、金钱墩、象牙林、
葵花岗四大名景为主题做成了松鼠桂鱼、金钱虾饼、象牙鸡条和葵花斩肉四道菜，据说原名葵花斩肉、
葵花肉丸，唐代郇国公韦陟的家厨韦巨元做松鼠桂鱼，金钱虾饼，象牙鸡条，葵花斩肉四道名菜，
令座中宾客叹服，葵花斩肉被改名为狮子头。此菜口感软糯滑腻，健康营养。',
'news-pic5.jpg','2021-01-08','aaa');

INSERT steak_news(sn_title,sn_content,sn_img,sn_create_time,sn_create_user) 
VALUES('烤鸭的由来','烤鸭是具有世界声誉的北京著名菜式，起源于中国南北朝时期，
《食珍录》中已记有炙鸭，在当时是宫廷食品。用料为优质肉食鸭北京鸭，果木炭火烤制，
色泽红润，肉质肥而不腻，外脆里嫩。北京烤鸭分为两大流派，而北京最著名的烤鸭店也即是两派的代表。
它以色泽红艳，肉质细嫩，味道醇厚，肥而不腻的特色，被誉为“天下美味”。',
'news-pic3.jpg','2021-01-05','aaa');





# 创建关于我们表
CREATE TABLE steak_about(
	sa_id		INT PRIMARY KEY AUTO_INCREMENT,
	sa_name		VARCHAR(64) NOT NULL,
	sa_phone	VARCHAR(64) NOT NULL,
	sa_fax		VARCHAR(64) NOT NULL,
	sa_zip_code	VARCHAR(64) NOT NULL,
	sa_address	VARCHAR(64) NOT NULL,
	sa_img		VARCHAR(64) NOT NULL,
	reserve1	VARCHAR(64), #备用字段
	reserve2	VARCHAR(64), #备用字段
	reserve3	VARCHAR(64)  #备用字段
);

INSERT steak_about(sa_name,sa_phone,sa_fax,sa_zip_code,sa_address,sa_img)
VALUES('总公司','0512-8081 5888','0512-8081 5566','215031',
'江苏省苏州市人民路3188号万达广场5幢迪欧大厦','about-pic3.jpg');

INSERT steak_about(sa_name,sa_phone,sa_fax,sa_zip_code,sa_address,sa_img)
VALUES('苏州分公司','0512-4167 3416','0512-4167 4531','215031',
'江苏省苏州市人民路1348号5栋','about-pic5.jpg');

INSERT steak_about(sa_name,sa_phone,sa_fax,sa_zip_code,sa_address,sa_img)
VALUES('丽江分公司','0542-3413 3314','0512-3413 1345','215031',
'云南省丽江路13453号','about-pic4.jpg');

INSERT steak_about(sa_name,sa_phone,sa_fax,sa_zip_code,sa_address,sa_img)
VALUES('扬州分公司','0512-6415 1314','0512-6415 4134','215031',
'江苏省扬州路12121号','about-pic1.jpg');

INSERT steak_about(sa_name,sa_phone,sa_fax,sa_zip_code,sa_address,sa_img)
VALUES('上海分公司','0512-8081 1524','0512-8081 5461','215031',
'上海市人民路4643号万达广场5幢迪欧大厦','about-pic2.jpg');




# 查询
SELECT * FROM steak_user;
SELECT * FROM steak_dish;
SELECT * FROM steak_dish_category;
SELECT * FROM steak_store;
SELECT * FROM steak_store_category;
SELECT * FROM steak_news;
SELECT * FROM steak_about;







