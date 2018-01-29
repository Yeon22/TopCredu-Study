package Layout.����_20180129;

public class layout {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>Document</title>
		    <link href="https://fonts.googleapis.com/css?family=Henny+Penny" rel="stylesheet">
		    <style>
		        *{margin: 0; padding: 0;}
		        body {font-family: 'Times New Roman', serif;}
		        li {list-style: none;}
		        a {text-decoration: none;}
		        img {border: 0;}
		        
		        #main_header{
		        	�߾� ����
		            width: 960px; margin: 0 auto;
		        	���� ��ǥ
		            height: 160px;
		            position: relative;
		        }
		        
		        #main_header > #title{
		            position: absolute;
		            left: 20px; top: 30px;
		        }
		        
		        #main_header > #main_gnb{
		            position: absolute;
		            right: 0; top: 0;
		        }
		        
		        #main_header > #main_lnb{
		            position: absolute;
		            right: 0; bottom: 10px;
		        }
		        
		        #title{
		            font-family: 'Henny Penny', cursive;
		        }
		        
		        	�޴� ����
		        hidden -> li ul �±׸� �Ѿ�� ��������
		        #main_gnb > ul {overflow: hidden;}
		        #main_gnb > ul > li {float: left;}
		        #main_gnb > ul > li > a {
		            display: block;  a�±װ� �ڽ�ó�� �ڱ� ������ ���´�.
		            padding: 2px 10px;  ���� �¿� ����
		            border: 1px solid black;
		        }
		        
		        #main_gnb > ul > li > a:hover{
		            background: black;
		            color: white
		        }
		        
		        	����ž ������ž �����ʹ��� ���ʹ���
		        #main_gnb > ul > li:first-child > a {border-radius: 10px 0 0 10px;}
		        #main_gnb > ul > li:last-child > a {border-radius: 0 10px 10px 0;}
		        
		        	�޴� 2��° ����
		        #main_lnb > ul {overflow: hidden;}
		        #main_lnb > ul > li {float: left;}
		        #main_lnb > ul > li > a{
		            display: block;
		            padding: 10px 20px;
		            border: 1px solid black;
		        }
		        
		        #main_lnb > ul > li > a:hover{
		            background: black;
		            color: white
		        }
		        
		        #main_lnb > ul > li:first-child > a {border-radius: 10px 0 0 10px;}
		        #main_lnb > ul > li:last-child > a {border-radius: 0 10px 10px 0;}
		        
		        	������ ����
		        #content{
		            width: 960px; margin: 0 auto;
		            overflow: hidden;
		        }
		        
		        #content > #main_section{
		            width: 750px;
		            float: left;
		        }
		        
		        #content > #main_aside{
		            width: 200px;
		            float: right;
		        }
		        
		        #main_section > article.main_article{
		            margin-bottom: 10px;
		            padding: 20px;
		            border: 1px solid black;
		        }
		        
		        	����̵�
		        	ù��° ��
		        input:nth-of-type(1) {display: none;}
		        input:nth-of-type(1) ~ div:nth-of-type(1) {display: none;}
		        input:nth-of-type(1):checked ~ div:nth-of-type(1) {display: block;}
		        
		        	�ι�° ��
		        input:nth-of-type(2) {display: none;}
		        input:nth-of-type(2) ~ div:nth-of-type(2) {display: none;}
		        input:nth-of-type(2):checked ~ div:nth-of-type(2) {display: block;}
		        
		        	�� ��� ����
		        section.buttons {overflow: hidden;}
		        section.buttons > label{
		            	��������
		            display: block; float: left;
		            	ũ�� �� ���� ��ġ ����
		            width: 100px; height: 30px;
		            line-height: 30px;
		            text-align: center;
		            	�׵θ� ����
		            box-sizing: border-box;
		            border: 1px solid black;
		            	���� �����ϱ�
		            background: black;
		            color: white;
		        }
		        
		        input:nth-of-type(1):checked ~ section.buttons > label:nth-of-type(1){
		            background: white;
		            color: black;
		        }
		        input:nth-of-type(2):checked ~ section.buttons > label:nth-of-type(2){
		            background: white;
		            color: black;
		        }
		        
		        	���
		        .item{
		            overflow: hidden;
		            padding: 10px;
		            border: 1px solid black;
		            border-top: none;
		        }
		        .thumbnail{
		            float: left;
		        }
		        .description{
		            float: left;
		            margin-left: 10px;
		        }
		        .description > strong{
		            display: block;
		            width: 120px;
		            white-space: nowrap;
		            overflow: hidden;
		            text-overflow: ellipsis;
		        }
		        
		        	Ǫ��
		        #main_footer{
		            	�߾� ����
		            width: 960px; margin: 0 auto;
		            margin-bottom: 10px;
		            	�׵θ�
		            box-sizing: border-box;
		            padding: 10px;
		            border: 1px solid black;
		            	����
		            text-align: center;
		        }
		        
		    </style>
		    
		</head>
		
		<body>
		    <header id="main_header">
		        <div id="title">
		            <h1>Byu Development</h1>
		            <h2>HTML5 + CSS3 Basic</h2>
		        </div>
		        <nav id="main_gnb">
		           <ul>
		                <li><a href="#">Web</a></li>
		                <li><a href="#">Mobile</a></li>
		                <li><a href="#">Game</a></li>
		                <li><a href="#">Simulation</a></li>
		                <li><a href="#">Data</a></li>
		            </ul>
		        </nav>
		        <nav id="main_lnb">
		            <ul>
		                <li><a href="#">HTML5</a></li>
		                <li><a href="#">CSS3</a></li>
		                <li><a href="#">JavaScript</a></li>
		                <li><a href="#">JQuery</a></li>
		                <li><a href="#">Node.js</a></li>
		            </ul>
		        </nav>
		    </header>
		    
		    <div id="content">
		       
		        <section id="main_section">
		           
		            <article class="main_article">
		                <h1>����ȭ��, ���������� ���١� �ֿ� ���θ� ù ���</h1>
		                <p>���� ����ȭ��� �ǽð� ���� ������ ���� Ŀ ���� �������� ���⿡ ������� ���ݴ�. �� ������ ���� �̷� ��Ȯ�Ǽ��� �ּ�ȭ�ϰ��� '�ǽð� �ü� �ݿ�' ����� �����ϰ� �����ϰ� �ִ�. 
		
		���� ���� ����ȭ��� ���Ÿ� �����ϸ� �� ������ �ü��� ���� �ݾ��� Ȯ���ϰ�, �� �����͸� ������ �������̰� �ﰢ ������ �� ������ ������ �ü� ������ ���� ȥ���� ���ִ� ���̴�.
		
		���� �ҹ� ����� ���ְ��� ����ȭ��� ������ �� ��ǰ���� �� �� ������ �� ������ ��������.
		
		�̹� ��ȹ�� ������ ������ �����ڴ� "������ �������̸� ���� �� ���ϰ� ������ ��ǰ�� ������ �� �ֵ��� �ϴ� ����� �ϳ��μ� ����� ���޸� �����ϴ� ���� �´�. ��ü�� ���� ����̳� �ñ� ���� �����ϰ� �ִ�"�� ���ߴ�.
		
		����ȭ��� ���ݲ� �������� �Ϻ� �ұԸ� ���ͳ� ���� �Ҽ� ������ �����ϰ�� ���� �������� ������ ��ʰ� ���� ������. 
		
		�ݸ� ���ܿ����� ����ȭ�� ��ȭ�� Ȱ���Ϸ��� �õ��� Ȱ���ϴ�. 
		</p>
		            </article>
		            
		            <article class="main_article">
		                <h1>'���ο��� ���缭 �� �ްڴ�'�� ���⿬�� ��û�� ����</h1>
		                <p>2013�⿡ ���⿬�� ��û�ڰ� �ް��� ���� 2012��(1952��� ����)������ �ص� �� 60���� ��ɿ����� �޾����� 2013��(1953�������)���� �� 61���� ���޿����� ������ ���� ſ�� ũ��. ���ݰ������� 2013����� 5�⸶�� �ܰ������� ���޿����� 1���� �ڷ� �з� ���������� �� 65������ �޴´�.
		
		���⿬�������� 2007�� 7������ ���Եƴ�. �ٸ� ���ݼ��������ٴ� ���� ���̴�.
		
		���ޱ��ڰ� ���� ���� �ñ⸦ �ִ� 5����� ���߸� ���� �Ⱓ�� ���� �� 7.2%(�� 0.6%)�� ���ڸ� ������ ��ɿ����� ����ش�.
		
		��ɿ��� ���ޱ��� ȹ���ϰ� ���� ��ɿ����� ��û�� ���� ������ �޴� ���� ����ϴ� ��� 1ȸ�� ��û�� �� �ִ�.
		</p>
		            </article>
		            
		            <article class="main_article">
		                <h1>���� ���� ����Ʈ�� ȭ��, �ϰ��� 3�� ��������Ŀ�� ��ȭ�� ��ų�?</h1>
		                <p>28�� �� ���� ���� �ұ����� �� ����Ʈ���� ���̳� �ϰ��� 3���� ������.
		
		29�� ������ �ҹ�籹�� ������ ���� ���� 7�� 10�в� �ұ����� �ִ� 15��¥�� ����Ʈ 14������ ���̳���. 
		
		�ҹ�籹�� ��� 31��� �η� 99���� ������ ȭ�� �߻� 1�ð� 20���� ���� ���� ��ȭ�ߴ�. 
		
		�� �ҷ� ���⸦ ���̸��ð� �������� �̼۵� ���� 3�� �� ��� ��� ��(91����)�� ȭ�� ���� ���� �� �̾� �����ϴ� ���� ��(64����)�� �Ƴ� ���� ��(63����)�� �̳� ���� ���� ���� �ŵ״�. 
		
		����ڿ� �ҹ漭 �������� ���� ������, ȭ�� ���� ����Ʈ �ҹ�ü��� ����� �۵����� �ʾ� �ʱ� ��ȭ�� ������� �޾���.</p>
		            </article>
		            
		        </section>
		        
		        <aside id="main_aside">
		            <input id="first" type="radio" name="tab" checked="checked" />
		            <input id="second" type="radio" name="tab" />
		            <section class="buttons">
		                <label for="first">First</label>
		                <label for="second">Second</label>
		            </section>
		            
		            <div class="tab_item">
		                <ul>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>HTML5 Canvas</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>HTML5 Audio</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>HTML5 Video</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>HTML5 Semantic Web</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                </ul>
		            </div>
		            <div class="tab_item">
		                <ul>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>CSS3 Transition</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>CSS3 Animation</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>CSS3 Border</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>CSS3 Box</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                </ul>
		            </div>
		        </aside>
		        
		    </div>
		    
		    <footer id="main_footer">
		        <h3>HTML5 + CSS3 Basic</h3>
		        <address>Website Layout Basic žũ������ ���ε�</address>
		    </footer>
		    
		</body>
		
		</html>
	 */

}
