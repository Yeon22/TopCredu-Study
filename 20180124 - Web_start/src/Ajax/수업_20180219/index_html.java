package Ajax.����_20180219;

public class index_html {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
		    <title>Document</title>
		    <script>
		        $(function(){
		            $("#d1").load("document_1.txt");
		            
		            $("#member").on("submit", function(){ //Ȯ�� ��ư�� ������ ��
		                var d = $(this).serialize(); //�� ��ҿ� ������ �����͸� �簡���Ѵ�.
		                
		                $.ajax({
		                    url:"member.php", //������ ���� �� ��û�� URL�ּ�
		                    type:"post", //������ ���� ���
		                    data:d, //������ ������
		                    success:function(result){ //���� �� ��û�� ���������� �Ǿ��� ��
		                        $("#txt1").text(result);
		                    }
		                });
		                
		                return false;
		            });
		        });
		    </script>
		</head>
		<body>
		    <div id="d1">����</div>
		    
		    <form action="member.php" method="post" name="member" id="member">
		        <fieldset>
		            <legend>ȸ������</legend>
		            <p>
		                <label for="user_name">�̸�</label>
		                <input type="text" name="user_name" id="user_name" />
		            </p>
		            <p>
		                <input type="submit" value="Ȯ��" />
		            </p>
		        </fieldset>
		    </form>
		    <h1 id="txt1"></h1>
		</body>
		</html>
	 */

}
