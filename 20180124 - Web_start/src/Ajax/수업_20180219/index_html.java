package Ajax.����_20180219;

public class index_html { //bitnami�� apm�� ��ġ�Ǿ� �ִ� ���¿��� �Ѵ�. �������� ����Ǵ� ���¿�����.
	
	/*
	 * <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
		<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
		<head>
		<title> RSS �����ϱ� </title>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
		    
		<script type="text/javascript">
		    $(function(){
		        $("#news_wrap h2 a").on("click",function(e){
		            e.preventDefault();
		            $("#news_wrap h2 a").removeClass("on");
		            $(this).addClass("on");
		
		        $.ajax({
		          url:'https://api.rss2json.com/v1/api.json',
		          dataType: "json",
		          data:{
		             rss_url:$(this).attr("href"),
		             api_key: 'g0fa8pn1tg2wcgsxqo1yr9jjtemyrsqpehi78hqf', //���� Api Key�� �Է��ϼ���.
		             count: 5
		          },
		          success: function (data) {
		            $("#news_list").empty();
		            console.log(data.items);
		            for(i in data.items) {
		              var newsTitle = data.items[i].title;
		              var newsUrl = data.items[i].link;
		
		              var newsDate = new Date(data.items[i].pubDate);
		              var newsDate_y = newsDate.getFullYear();
		              var newsDate_m = newsDate.getMonth()+1;
		              if(newsDate_m < 10) {newsDate_m = "0" + newsDate_m;}
		              var newsDate_d = newsDate.getDate();
		              if(newsDate_d < 10) {newsDate_d = "0" + newsDate_d;}
		              var theDate = newsDate_y + "-" 
		              + newsDate_m + "-" + newsDate_d;
		
		              var newsList = 
		              $("<li><a href='#'></a><span></span></li>");
		              newsList.find("a").attr("href", newsUrl);
		              newsList.find("a").attr("target", "_blank");
		              newsList.find("a").text(newsTitle);
		
		              newsList.find("span").text(theDate);
		              $("#news_list").append(newsList);
		            }
		          }
		        });
		     });
		
		     $("#news_wrap h2 a").eq(0).click();
		    });
		    </script>
		    
		    <style type="text/css">
		        /*�⺻ ����
		        *{margin:0;padding:0;}
		        li{list-style:none;}
		        body{font:12px Margun Gothic,"�������",gulim,"����",sans-serif;color:#333;padding-top:20px;}
		        h1,h2,h3,h4,h5,h6{font-size:100%;font-weight:normal;}
		        a{color:#333;text-decoration:none;outline:none;}
		        h1{font-size:2em;text-align:center;margin-bottom:10px;color:#c00;}
		
		        /*�� �޴� ������
		        #news_wrap{width:380px;margin:0 auto;background:#FFF url("images/rss_bg.gif") 0 0 repeat-x;}
		        #news_wrap li{height:25px;line-height:25px;position:relative;}
		        #news_wrap span{position:absolute;top:0;right:3px;}
		        #news_wrap li a{display:block;width:210px;
		           white-space:nowrap;overflow:hidden;
		           text-overflow:ellipsis;padding-left:15px;
		           background:url("images/bullet.gif") 5px 10px no-repeat;
		        }
		        #news_wrap h2{float:left;padding-right:3px;margin-bottom:10px;}
		        #news_list{clear:both;}
		
		        /*��Ȱ��ȭ �� ��ư ���
		        #news_wrap h2 a{
		          display:inline-block;padding:8px 10px;
		          border:1px solid #aaa;
		          border-bottom:none;
		          border-radius:5px 5px 0 0;
		          background-color:#ccc;
		        }
		        
		        /*��Ȱ��ȭ �� ��ư ���
		        #news_wrap h2 a.on{background-color:#fff;font-weight:bold;}
		    </style>
		    
		    </head>
		    <body>
		        <h1>��������</h1>
		        <div id="news_wrap">
		          <h2> <!-- �ʱ⿡ ù ��° ��ư���� class="on"�� ���ԵǾ� �ֽ��ϴ�. -->
		            <a href="http://myhome.chosun.com/rss/www_section_rss.xml" class="on">������ �ֿ䴺��</a>
		          </h2>
		          <h2>
		            <a href="http://www.chosun.com/site/data/rss/ent.xml">�������̸�Ʈ</a>
		          </h2>
		          <h2>
		            <a href="http://newsplus.chosun.com/hitdata/xml/se/sports/index.xml">������</a>
		          </h2>
		          <ul id="news_list">
		          </ul>
		        </div>
		    </body>
		</html>
	 */

}
