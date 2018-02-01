package ResponsiveWeb.����_20180201;

public class style_css {
	
	/*
	 * @charset "utf-8"
		@import url('https://fonts.googleapis.com/css?family=Poiret+One');
		
		
			�ʱ�ȭ
		*{ margin:0; padding: 0; }
		ol,ul { list-style: none;}
		a { outline:0; text-decoration: none; color:#555;}
		img { border:0;}
		body { font:12px/1.6 'Poiret One'; color:#555;}
		
		
			���̾ƿ�
		header { position:fixed; width:15%; height:100%; background:#fff; top:0px;left:0px;}
		nav { position: relative; width:85%; height:35px; background:#212121; margin-left: 15%;}
		section { width:85%; position:relative; margin-left: 15%; }
		article { float:left; height:260px; transition:all 0.5s; animation:scale 1s 1; }
		
		@keyframes scale{
		    0% {transform:scale(0);}
		    100% { transform: scale(1);}
		}
		
		
			���� �ڽ� ũ������ 
		article:nth-child(1)  { width:60%; height: 520px; background:#ddd; }
		article:nth-child(2)  { width:40%; background: #ccc; }
		article:nth-child(3)  { width:20%; background: #bbb; }
		article:nth-child(4)  { width:20%; background: #aaa; }
		article:nth-child(5)  { width:20%; background: #999; }
		article:nth-child(6)  { width:40%; background: #888; }
		article:nth-child(7)  { width:20%; background: #777; }
		article:nth-child(8)  { width:20%; background: #666; }
		article:nth-child(9)  { width:40%; background: #555; }
		article:nth-child(10) { width:20%; background: #444; }
		article:nth-child(11) { width:20%; background: #333; }
		article:nth-child(12) { width:20%; background: #222; }
		
		
			header ������ 
		header h1 { width:180px; height: 136px; background:url("../img/logo1.png") no-repeat 0px 0px; background-size:contain; position:absolute; 
		    top:70px; left:50%;margin-left: -90px; text-indent: -99999px;}
		#gnb { position:absolute; top:300px; right:57px;}
		#gnb a{ display:block; padding: 8px 30px; font-size:17px; font-weight: bold; color:#555; text-align: left; line-height:1.8; transition:all .5s;}
		#gnb a:hover {color:skyblue;}
		#gnb a i {margin-right:13px;}
		.snsSet {width:90px; height:47px; position:absolute; bottom:50px; right:50%; margin-right:-45px; }
		.snsSet a {float:left;}
		
		article>div { position:relative; width: 100%; height: 100%;overflow: hidden; cursor: pointer;}
		
		
			nav
		nav a:nth-child(1) { position:absolute; top:5px; left:10px;}
		nav a:nth-child(2) { position:absolute; top:5px; left:150px;}
		nav a:nth-child(3) { position:absolute; top:5px; right:90px;}
		nav a:nth-child(4) { position:absolute; top:5px; right:10px;}
		
		
			��� �̹��� ����
		article .bg1 { background-image: url(../img/pic1.jpg);}
		article .bg2 { background-image: url(../img/pic2.jpg);}
		article .bg3 { background-image: url(../img/pic3.jpg);}
		article .bg4 { background-image: url(../img/pic4.jpg);}
		article .bg5 { background-image: url(../img/pic5.jpg);}
		article .bg6 { background-image: url(../img/pic6.jpg);}
		article .bg7 { background-image: url(../img/pic7.jpg);}
		
		
			�̹����ڽ�
		article .bg { background-size:cover; background-position: center center;}
		article .bg span { font-size:60px; color:#fff; position:absolute; bottom:0px; right:20px; transform: scale(10); opacity:0; transition:all 0.6s;}
		article .bg1 span { font-size:170px; bottom: -76px; right:-6px; opacity:1; transform: scale(1); transition:all 1s;}
		
		
			�̹����ڽ� ȣ��ȿ��
		article:hover .bg span { opacity:1; transform: scale(1);}
		article .bg1:hover span {transform: rotateY(360deg); color:#222;}
		
		
			�ؽ�Ʈ�ڽ�
		article .txt { color:#666; background:#fff; box-sizing: border-box; padding:40px 30px; transition: all 1s;  }
		article:nth-child(3) .txt {background: #bff7fa;}
		article:nth-child(11) .txt {background:#e3f1fb;}
		article .txt i{font-size:300px; color:#b2effc; opacity:0; position:absolute; bottom:-70px; right:-200px; transition: all 0.7s;}
		article:nth-child(3) .txt i{  position: absolute; bottom:-20px; right: -15px; font-size:200px; color:#fff; opacity:0.7;}
		article .txt strong { font-size:30px; font-weight: normal; line-height: 1.6; color:#444; margin-bottom: 20px; transition:all 1s;}
		
		
			�ؽ�Ʈ �ڽ� ȣ��ȿ��
		article:hover .txt { background:#6ce2fb; color:#fff;}
		article:hover .txt i{right:0px; opacity: 0.5;}
		article:hover .txt strong { color:#fff;}
		
		
		
		
		@media screen and (min-width:1280px) and (max-width:1599px) {
		    header { position:relative; width:100%; height:80px;}
		    nav { width:100%; margin-left: 0%;}
		    section { width:100%; margin-left: 0px; }
		    
		    	header ������ 
		    header h1 { width:250px; height: 50px; background:url("../img/logo2.png");   top:20px; left:20px;margin-left: 0px; }
		    #gnb {  top:20px; right:200px;}
		    #gnb li {float: left; }
		    .snsSet {bottom:20px; right:80px; }
		}
		
		@media screen and (min-width:1204px) and (max-width:1279px) {
		    header { position:relative; width:100%; height:80px;}
		    nav { width:100%; margin-left: 0%;}
		    section { width:100%; margin-left: 0px; }
		    
		    article:nth-child(1)  { width:75%;  }
		    article:nth-child(2)  { width:25%;  }
		    article:nth-child(3)  { width:25%;  }
		    article:nth-child(4)  { width:25%;  }
		    article:nth-child(5)  { width:25%;  }
		    article:nth-child(6)  { width:50%;  }
		    article:nth-child(7)  { width:50%;  }
		    article:nth-child(8)  { width:25%;  }
		    article:nth-child(9)  { width:25%;  }
		    article:nth-child(10) { width:50%;  }
		    article:nth-child(11) { width:25%;  }
		    article:nth-child(12) { width:25%;  }
		
		    	header ������ 
		    header h1 { width:250px; height: 50px; background:url("../img/logo2.png"); top:20px; left:20px;margin-left: 0px; }
		    #gnb {  top:20px; right:30px;}
		    #gnb li {float: left; }
		    .snsSet {display:none;}
		}
		
		
		@media screen and (min-width:780px) and (max-width:1203px) {
		    header { position:relative; width:100%; height:80px;}
		    nav { width:100%; margin-left: 0%;}
		    section { width:100%; margin-left: 0px; }
		    
		    article:nth-child(1)  { width:100%; height:400px; }
		    article:nth-child(2)  { width:66.6666%;  }
		    article:nth-child(3)  { width:33.3333%;  }
		    article:nth-child(4)  { width:33.3333%; display:none;}
		    article:nth-child(5)  { width:33.3333%;  }
		    article:nth-child(6)  { width:66.6666%;  }
		    article:nth-child(7)  { width:66.6666%; display:none; }
		    article:nth-child(8)  { width:33.3333%;  }
		    article:nth-child(9)  { width:33.3333%;  }
		    article:nth-child(10) { width:66.6666%; display:none; }
		    article:nth-child(11) { width:33.3333%;  }
		    article:nth-child(12) { width:33.3333%; display:none;  }
		    
		    	header ������ 
		    header h1 { width:250px; height: 50px; background:url("../img/logo2.png");   top:20px; left:20px;margin-left: 0px; }
		    #gnb {  top:20px; right:10px;}
		    #gnb li {float: left; }
		    #gnb a { padding: 10px 10px;}
		    .snsSet {display:none;}
		}
		
		@media screen and (min-width:640px) and (max-width:779px) {
		    header { position:relative; width:100%; height:80px;}
		    nav { width:100%; margin-left: 0%;}
		    section { width:100%; margin-left: 0px; }
		    
		    article:nth-child(1)  { width:100%; height:400px; }
		    article:nth-child(2)  { width:100%;  }
		    article:nth-child(3)  { width:33.3333%; display:none; }
		    article:nth-child(4)  { width:100%; display:none;}
		    article:nth-child(5)  { width:50%;  }
		    article:nth-child(6)  { width:50%;  }
		    article:nth-child(7)  { width:66.6666%; display:none; }
		    article:nth-child(8)  { width:50%;  }
		    article:nth-child(9)  { width:50%;  }
		    article:nth-child(10) { width:66.6666%; display:none; }
		    article:nth-child(11) { width:50%;  }
		    article:nth-child(12) { width:50%;  }
		    
		    	header ������ 
		    header h1 { width:250px; height: 50px; background:url("../img/logo2.png");   top:20px; left:20px;margin-left: 0px; }
		    #gnb {  top:20px; right:10px;}
		    #gnb li {float: left; }
		    #gnb a { padding: 10px 10px;}
		    .snsSet {display:none;} 
		}
		
		@media screen and (min-width:480px) and (max-width:639px) {
		    header { position:relative; width:100%; height:130px;}
		    nav { display: none;}
		    section { width:100%; margin-left: 0px; }
		    article { height:150px;}
		    
		    article:nth-child(1)  { width:100%; height:300px; }
		    article:nth-child(2)  { width:100%;  }
		    article:nth-child(3)  { width:33.3333%; display:none; }
		    article:nth-child(4)  { width:100%; display:none;}
		    article:nth-child(5)  { width:50%;  }
		    article:nth-child(6)  { width:50%;  }
		    article:nth-child(7)  { width:66.6666%; display:none; }
		    article:nth-child(8)  { width:50%;  }
		    article:nth-child(9)  { width:50%;  }
		    article:nth-child(10) { width:66.6666%; display:none; }
		    article:nth-child(11) { width:50%;  }
		    article:nth-child(12) { width:50%;  }
		    
		    	header ������ 
		    header h1 { position: relative; top: 20px; left:0px; width:250px; height: 50px; background:url("../img/logo2.png");   margin: 0px auto; }
		    #gnb { width:100%; height: 40px; top:80px; right:10px;}
		    #gnb li {float: left; width:25%; }
		    #gnb a { padding: 4px; text-align: center;}
		    .snsSet {display:none;}
		    
		    article .bg1 span { font-size: 120px; bottom: -50px; }
		    article .txt strong { font-size: 25px; }
		    article .txt em { display: none; }
		}
		
		@media screen and (max-width:479px) {
		    header { position:fixed; width:100%; height:40px; background-color:transparent; z-index: 5;}
		    nav { display: none;}
		    section { width:100%; margin-left: 0px; z-index: 4; }
		    article { display: none;}    
		    article:nth-child(1)  { display:block; position:fixed; width:100%; height:100%; }
		    
		    	header ������ 
		    header h1 {  top: 20px;  width:140px; margin-left: -70px; }
		    #gnb { width:250px; height: 140px;  right:50%; margin-right: -125px;}    
		    #gnb a { width:100%; background:#000; box-sizing: border-box;margin:8px 0px; border-radius: 10px; opacity:0.5; color:#fff;}
		    #gnb a:hover {opacity:1; transform:scale(1.1);}
		    
		    article:nth-child(1) span { display: none; }
		}
	 */

}
