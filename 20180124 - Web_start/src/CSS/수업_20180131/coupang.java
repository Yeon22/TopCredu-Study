package CSS.����_20180131;

public class coupang {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>Document</title>
		<!--  �ʱ�ȭ  -->
		    <style>
		        * {
		            margin: 0; padding: 0;
		            font: normal 12px 'Dotum';
		        }
		        
		        a {text-decoration: none;}
		        img {border: 0;}
		        ul {list-style: none;}
		        body {
		            width: 980px;
		            margin: 0 auto;
		        }
		    </style>
		    
		    <style>
		        #main_header {
		            position: relative;
		            height: 75px;
		        }
		        
		        #main_header > h1.logo {
		            position: absolute;
		            left: 15px; top: 10px;
		        }
		        
		        #main_header > div.login_menu {
		            position: absolute;
		            top: 10px; right: 0px;
		        }
		    </style>
		    
		<!--  ���̵�  -->
		    <style>
		        body {
		            position: relative;
		        }
		        
		        #global_aside {
		            position: absolute;
		            left: 990px; top: 75px;
		            width: 90px;
		        }
		        
		        #global_aside > a {
		            display: block;
		            margin-bottom: 5px;
		        }
		    </style>
		    
		<!--  �׺���̼� ��  -->
		    <style>
		        #top_gnb {
		            overflow: hidden;
		        }
		        
		        #top_gnb > div.menu {
		            float: left;
		            width: 140px; height: 50px;
		            background: url(img/top_gnb.png);
		        }
		        
		        #top_gnb > div.item_1 {background-position: 0px 0px;}
		        #top_gnb > div.item_2 {background-position: 0px -50px;}
		        #top_gnb > div.item_3 {background-position: 0px -100px;}
		        #top_gnb > div.item_4 {background-position: 0px -150px;}
		        #top_gnb > div.item_5 {background-position: 0px -200px;}
		        #top_gnb > div.item_6 {background-position: 0px -250px;}
		        #top_gnb > div.item_7 {background-position: 0px -300px;}
		        
		        #top_gnb > div.item_1:hover {background-position: 0px -350px;}
		        #top_gnb > div.item_2:hover {background-position: 0px -400px;}
		        #top_gnb > div.item_3:hover {background-position: 0px -450px;}
		        #top_gnb > div.item_4:hover {background-position: 0px -500px;}
		        #top_gnb > div.item_5:hover {background-position: 0px -550px;}
		        #top_gnb > div.item_6:hover {background-position: 0px -600px;}
		        #top_gnb > div.item_7:hover {background-position: 0px -650px;}
		        
		        #top_gnb > div.item_1.active {background-position: 0px -350px;}
		        #top_gnb > div.item_2.active {background-position: 0px -400px;}
		        #top_gnb > div.item_3.active {background-position: 0px -450px;}
		        #top_gnb > div.item_4.active {background-position: 0px -500px;}
		        #top_gnb > div.item_5.active {background-position: 0px -550px;}
		        #top_gnb > div.item_6.active {background-position: 0px -600px;}
		        #top_gnb > div.item_7.active {background-position: 0px -650px;}
		    </style>
		    
		<!--  ���̰��̼� �Ʒ�  -->
		    <style>
		        #bottom_gnb {
		            overflow: hidden;
		        }
		        
		        #bottom_gnb > div.menu {
		            float: left;
		            width: 98px; height: 80px;
		            background: url(img/bottom_gnb.png);
		        }
		        
		        #bottom_gnb > div.item_1 {background-position: 0px 0px;}
		        #bottom_gnb > div.item_2 {background-position: 0px -80px;}
		        #bottom_gnb > div.item_3 {background-position: 0px -160px;}
		        #bottom_gnb > div.item_4 {background-position: 0px -240px;}
		        #bottom_gnb > div.item_5 {background-position: 0px -320px;}
		        #bottom_gnb > div.item_6 {background-position: 0px -400px;}
		        #bottom_gnb > div.item_7 {background-position: 0px -480px;}
		        #bottom_gnb > div.item_8 {background-position: 0px -560px;}
		        #bottom_gnb > div.item_9 {background-position: 0px -640px;}
		        #bottom_gnb > div.item_10 {background-position: 0px -720px;}
		        
		        #bottom_gnb > div.item_1:hover {background-position: 0px -800px;}
		        #bottom_gnb > div.item_2:hover {background-position: 0px -880px;}
		        #bottom_gnb > div.item_3:hover {background-position: 0px -960px;}
		        #bottom_gnb > div.item_4:hover {background-position: 0px -1040px;}
		        #bottom_gnb > div.item_5:hover {background-position: 0px -1120px;}
		        #bottom_gnb > div.item_6:hover {background-position: 0px -1200px;}
		        #bottom_gnb > div.item_7:hover {background-position: 0px -1280px;}
		        #bottom_gnb > div.item_8:hover {background-position: 0px -1360px;}
		        #bottom_gnb > div.item_9:hover {background-position: 0px -1440px;}
		        #bottom_gnb > div.item_10:hover {background-position: 0px -1520px;}
		        
		        #bottom_gnb > div.item_1.active {background-position: 0px -800px;}
		        #bottom_gnb > div.item_2.active {background-position: 0px -880px;}
		        #bottom_gnb > div.item_3.active {background-position: 0px -960px;}
		        #bottom_gnb > div.item_4.active {background-position: 0px -1040px;}
		        #bottom_gnb > div.item_5.active {background-position: 0px -1120px;}
		        #bottom_gnb > div.item_6.active {background-position: 0px -1200px;}
		        #bottom_gnb > div.item_7.active {background-position: 0px -1280px;}
		        #bottom_gnb > div.item_8.active {background-position: 0px -1360px;}
		        #bottom_gnb > div.item_9.active {background-position: 0px -1440px;}
		        #bottom_gnb > div.item_10.active {background-position: 0px -1520px;}
		    </style>
		    
		<!--  ���  -->
		    <style>
		        #detail_list {
		            overflow: hidden;
		            padding: 10px;
		            background: #3B414D;
		            padding-bottom: 15px;
		        }
		        
		        #detail_list > ul {
		            float: left;
		            width: 192px;
		        }
		        
		        #detail_list > ul > li {
		            height: 13px;
		            margin-top: 5px;
		            padding: 3px 5px;
		            color: #F3F3F3;
		            white-space: nowrap;
		            overflow: hidden;
		            text-overflow: ellipsis;
		        }
		        
		        #detail_list > ul > li.header {
		            padding-left: 15px;
		        }
		        
		        #detail_list > ul > li.header > p {
		            font-weight: bold;
		            color: #48C5FF;
		        }
		    </style>
		    
		<!--  ����  -->
		    <style>
		        #content { margin-top: 10px; }
		        
		        #prodect_section {
		            overflow: hidden;
		            margin-top: 5px;
		        }
		        
		        #prodect_section > #product_article {
		            float: left;
		            width: 795px;
		        }
		        
		        #prodect_section > #prodect_aside {
		            float: right;
		            padding-bottom: 5px;
		            width: 170px;
		        }
		        
		        #prodect_section > #product_article > img { display: block; }
		    </style>
		    
		<!--  Ǫ��  -->
		    <style>
		        #main_footer {
		            height: 40px;
		            padding: 10px;
		            margin-bottom: 10px;
		            background: #9C9C9C;
		            border-radius: 5px;
		            text-align: center;
		        }
		        
		        #main_footer > h1 {
		            font-size: 1.5em;
		            font-weight: bold;
		        }
		        
		        #main_footer > h2 {
		            font-size: 1.2em;
		            font-weight: bold;
		        }
		    </style>
		    
		</head>
		
		<body>
		    <header id="main_header"> 
		        <h1 class="logo">
		            <a href="#"><img src="img/title.png" /></a>
		        </h1>
		        
		        <div class="login_menu">
		            <span><a href="#">�α���</a></span>
		            <span><a href="#">ȸ������</a></span>
		            <span><a href="#">������</a></span>
		        </div>
		    </header>
		    
		    <aside id="global_aside">
		        <a><img src="http://placehold.it/90x160" /></a>
		        <a><img src="http://placehold.it/90x160" /></a>
		        <a><img src="http://placehold.it/90x160" /></a>
		        <a><img src="http://placehold.it/90x160" /></a>
		        <a><img src="http://placehold.it/90x160" /></a>
		        <a><img src="http://placehold.it/90x160" /></a>
		        <a><img src="http://placehold.it/90x160" /></a>
		        <a><img src="http://placehold.it/90x160" /></a>
		        <a><img src="http://placehold.it/90x160" /></a>
		        <a><img src="http://placehold.it/90x160" /></a>
		    </aside>
		    
		    <nav id="top_gnb">
		        <div class="menu item_1 active"></div>
		        <div class="menu item_2"></div>
		        <div class="menu item_3"></div>
		        <div class="menu item_4"></div>
		        <div class="menu item_5"></div>
		        <div class="menu item_6"></div>
		        <div class="menu item_7"></div>
		    </nav>
		    
		    <nav id="bottom_gnb">
		        <div class="menu item_1"></div>
		        <div class="menu item_2"></div>
		        <div class="menu item_3"></div>
		        <div class="menu item_4"></div>
		        <div class="menu item_5"></div>
		        <div class="menu item_6"></div>
		        <div class="menu item_7"></div>
		        <div class="menu item_8"></div>
		        <div class="menu item_9 active"></div>
		        <div class="menu item_10"></div>
		    </nav>
		    
		    <div id="detail_list">
		        <ul class="column_1">
		            <li class="header"><p>���ӿ� ��Ʈ��</p></li>
		            <li>���̿� ���ӿ� ��Ʈ��</li>
		            <li>��ƺ�� ���ӿ� ��Ʈ��</li>
		            <li>��� ���ӿ� ��Ʈ��</li>
		            <li class="header"><p>��Ʈ���</p></li>
		            <li>���ŰƼ ��Ʈ���</li>
		            <li>������ ��Ʈ��� ��Ư��</li>
		            <li>ī�ǹٶ� ��Ʈ���</li>
		            <li>���� ��Ʈ���</li>
		            <li>����� ��Ʈ���</li>
		        </ul>
		        
		        <ul class="column_2">
		            <li>�Ѹ� ��Ʈ���</li>
		            <li class="header"><p>��Ʈ�� ����</p></li>
		            <li>�ػ��� �귣�� ��Ʈ�� ����</li>
		            <li>���뺸�� ����</li>
		            <li>���� ����</li>
		            <li class="header"><p>��ħ��/��</p></li>
		            <li>���̹ٳ��� ��ħ��</li>
		            <li>�轼 ��</li>
		            <li>���Ŭ���� �ﰢ ��ħ��</li>
		            <li>��� ��Ʈ���䰳���� ��</li>
		        </ul>
		        
		        <ul class="column_3">
		            <li>�Ѹ� ��Ʈ���</li>
		            <li class="header"><p>��Ʈ�� ����</p></li>
		            <li>�ػ��� �귣�� ��Ʈ�� ����</li>
		            <li>���뺸�� ����</li>
		            <li>���� ����</li>
		            <li class="header"><p>��ħ��/��</p></li>
		            <li>���̹ٳ��� ��ħ��</li>
		            <li>�轼 ��</li>
		            <li>���Ŭ���� �ﰢ ��ħ��</li>
		            <li>��� ��Ʈ���䰳���� ��</li>
		        </ul>
		        
		        <ul class="column_4">
		            <li>�Ѹ� ��Ʈ���</li>
		            <li class="header"><p>��Ʈ�� ����</p></li>
		            <li>�ػ��� �귣�� ��Ʈ�� ����</li>
		            <li>���뺸�� ����</li>
		            <li>���� ����</li>
		            <li class="header"><p>��ħ��/��</p></li>
		            <li>���̹ٳ��� ��ħ��</li>
		            <li>�轼 ��</li>
		            <li>���Ŭ���� �ﰢ ��ħ��</li>
		            <li>��� ��Ʈ���䰳���� ��</li>
		        </ul>
		        
		        <ul class="column_5">
		            <li>�Ѹ� ��Ʈ���</li>
		            <li class="header"><p>��Ʈ�� ����</p></li>
		            <li>�ػ��� �귣�� ��Ʈ�� ����</li>
		            <li>���뺸�� ����</li>
		            <li>���� ����</li>
		            <li class="header"><p>��ħ��/��</p></li>
		            <li>���̹ٳ��� ��ħ��</li>
		            <li>�轼 ��</li>
		            <li>���Ŭ���� �ﰢ ��ħ��</li>
		            <li>��� ��Ʈ���䰳���� ��</li>
		        </ul>
		    </div>
		    
		    <div dir="content">
		        <figure id="product_image">
		            <img src="http://placehold.it/988x440" />
		        </figure>
		        
		        <section id="prodect_section">
		            <article id="product_article">
		                <img src="http://placehold.it/795x400" />
		                <img src="http://placehold.it/795x400" />
		                <img src="http://placehold.it/795x400" />
		            </article>
		            
		            <aside id="prodect_aside">
		                <a href="#"><img src="http://placehold.it/170x200" /></a>
		                <a href="#"><img src="http://placehold.it/170x200" /></a>
		                <a href="#"><img src="http://placehold.it/170x200" /></a>
		                <a href="#"><img src="http://placehold.it/170x200" /></a>
		                <a href="#"><img src="http://placehold.it/170x200" /></a>
		                <a href="#"><img src="http://placehold.it/170x200" /></a>
		            </aside>
		        </section>
		    </div>
		    
		    <footer id="main_footer">
		        <h1>��� �� �Ҽ�Ŀ�ӽ� ���� &copy; T3YSoft žũ������ qqwwee@naver.com</h1>
		    </footer>
		</body>
		
		</html>
	 */

}
