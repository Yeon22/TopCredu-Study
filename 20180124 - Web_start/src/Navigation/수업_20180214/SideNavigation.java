package Navigation.����_20180214;

public class SideNavigation {
	
	/*
	 * <!--
	*    UI����
	*    side navigation ����
	*
	*    ���� ������ : 2018-02-14
	-->
	
	
	<!DOCTYPE html>
	<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	    <style>
	    // ���̵�� ��Ÿ�� 
	        .sidenav { 
	            height: 100%; 
	            width: 0;
	           
	           	����(fixed)������Ʈ�� ����Ʈ�� ��������� ��ġ�� �����Ǵµ�, �̴� �������� ��ũ�� �Ǵ��� �� ���� ���� ��ġ�Ѵٴ� ��.
	           	relative�� ���������� top�̳� right, bottom, left������Ƽ�� ���ȴ�. 
	            position: fixed;
	            
	            // position �Ӽ��� absolute ������ �����ϸ� �±׵��� ��ġ�� �� �� �ִ�.
	             * �Ϲ������� �� ���߿� ������ �±װ� ���� ��ġ�ǳ�, style�Ӽ��� z-index�� �̿��ϸ� �� ���� ��ġ��Ű�ų� �� �Ʒ��� ��ġ��ų �� �ִ�.
	             * z-index���� �������� ��, �������� �Ʒ��� ��ġ�Ǹ� ���� Ȥ�� �ڿ��� ���� ����Ѵ�. 
	            z-index: 1;
	            
	            top: 0;
	            left: 0;
	            background-color: rgb(0,154,200);
	            
	            // x������ ������ �Ѿ�� ������ �ʵ��� ó��. x�� ��ũ�ѹ� ��Ÿ���� ����. 
	            overflow-x: hidden;
	            
	            // transition-duration�� ��ȭ�� ����, �Ǵ� �� �и�������(1/1000��)�� ���� �Ͼ���� �����Ѵ�.
	               6s, 0.5s, 3s, 120ms �̶�� ���� �ִٸ�, �̴� ���� 6��, 0.5��, 0.3��, 120�и��������� ���̴�.
	            transition: 0.5s ease-in-out;
	            
	            padding-top: 60px;
	        }
	        
	        .sidenav a {
	        	// �� ������ �Ʒ� ������ �ǹ��� 
	            padding: 8px 8px 8px 32px;
	            // a ��ũ ������ ����� 
	            text-decoration: none;
	 			// ������Ʈ ũ�� 25px 
	            font-size: 25px;
	 			// �÷� ȭ��Ʈ 
	            color: #fff;
	            
	               none : ������ ����
	               block : ��� �ڽ�
	               inline : �ζ��� �ڽ�
	               inline-block : block�� inline�� �߰� ����
	            display: block;
	            
	            transition: 0.2s ease-in-out;
	        }
	        
	        .sidenav a:hover { color: #000; }
	        
	        .closebtn {
	            position: absolute;
	            top: 0;
	            right: 25px;
	            
	            // CSS�� ���߿� ������ ���� ����ȴ�. ���� ���߿� ������ ���� ������� �ʰ� �Ϸ��� �Ӽ��� �ڿ� !important�� ���̸� �ȴ�.
	            font-size: 36px !important;
	            
	            margin-left: 50px;
	        }
	        
	        .openmenu:hover {
	            color: rgb(0,154,200);
	            transition: 0.5s ease-in-out;
	        }
	        
	        .openmenu {
	            font-size: 25px;
	            
	            // cursor�Ӽ��� �̿��ϸ� ���콺 Ŀ���� ���¸� ���� 
	            cursor: pointer;
	            transition: 0.5s ease-in-out;
	        }
	        
	        .openmenu > i { font-size: 30px; }
	        
	        #main { transition: 0.5s ease-in-out; }
	        
	        // �̵������ ����
	        @media screen and (max-height:450px) {
	            .sidenav {
	                padding-top: 15px;
	            }
	            .sidenav a {
	                font-size: 18px;
	            }
	        }
	    </style>
	    <title>Document</title>
	</head>
	<body>
	    <div id="mysidenav" class="sidenav">
	        <a href="#" class="closebtn" onclick="closeNav()">x</a>
	        <a href="#">About</a>
	        <a href="#">Services</a>
	        <a href="#">Clients</a>
	        <a href="#">Contact</a>
	        <a href="#">Portfolio</a>
	    </div>
	    <div id="main">
        	<h2>side_navigation ����</h2>
        	<p>�Ʒ� �޴���ư�� Ŭ���ϸ� ���̵� �׺���̼��� �����ϴ�.</p>
    	/div>
	    <span class="openmenu" onclick="openNav()"><i class="fa fa-angle-double-left fa-5" aria-hidden="true"></i>open</span>
	    
	    <script>
	        function openNav(){
	            //Ǫ���޴�
	            //mysidenav ���̵��� ��Ÿ�� �ʺ��� 250px�� �ٲ۴�.
	//            document.getElementById('mysidenav').style.width = '250px';
	//            document.getElementById('main').style.marginLeft = '250px';
	            
	            //Ǯ���̵�
	            document.getElementById('mysidenav').style.width = '100%';
	        }
	        
	        function closeNav(){
	            //Ǫ���޴�
	            //mysidenav ���̵��� ��Ÿ�� �ʺ��� 0px�� �ٲ۴�.
	//            document.getElementById('mysidenav').style.width = '0px';
	//            document.getElementById('main').style.marginLeft = '0px';
	            
	            //Ǯ���̵�
	            document.getElementById('mysidenav').style.width = '0';
	        }
    	</script>
	</body>
	</html>
	 */

}
