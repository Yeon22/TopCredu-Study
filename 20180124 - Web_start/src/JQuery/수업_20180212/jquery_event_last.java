package JQuery.����_20180212;

public class jquery_event_last {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>Document</title>
		    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
		    <script>
		        $(function(){
		            var size = 12;
		            var body = $("body");
		            
		            $(".zoom button").on("click", function(){ //���� ũ���� ��ư���� Ŭ������ ��
		                //�̺�Ʈ�� ����� button��� �� Ŭ���� ��ư�� �ε��� ���� ���� btn_index�� �Ҵ��Ѵ�.
		                var btn_index = $(".zoom button").index(this); 
		                
		                if(btn_index==0){ //[+]�� Ŭ������ ��
		                    size++;
		                    body.css("font-size",size+"px");
		                }else if(btn_index==2){ //[-]�� Ŭ������ ��
		                    size--;
		                    body.css("font-size",size+"px");
		                }else{ //[0]�� Ŭ������ ��
		                    body.css("font-size","12px"); //���� ũ���� �Ӽ��� 12px�� ����ȴ�.
		                    size = 12;
		                }
		            });
		            
		            $("#fs").on("change", function(){ //���ڸ���� �������� ��
		                body.css("font-family", $(this).val()); //���� ����� �ٲ۴�.
		            });
		        });
		    </script>
		</head>
		<body>
		    <div id="f_wrap">
		        <dl>
		            <dt>����ũ��</dt>
		            <dd class="zoom">
		                <button>+</button>
		                <button>0</button>
		                <button>-</button>
		            </dd>
		            <dt>���ڸ��</dt>
		            <dd class="f_style">
		                <select name="fs" id="fs">
		                    <option value="dotum, '����', sans-serif">����</option>
		                    <option value="gulim, '����', sans-serif">����</option>
		                    <option value="magun gothic, '�������', sans-serif">�������</option>
		                    <option value="magun gothic, '�������', serif">�ü�</option>
		                </select>
		            </dd>
		        </dl>
		    </div>
		    <p id="txt_wrap">
		        Ű���� ���ټ��̶�.....
		    </p>
		</body>
		</html>
	 */

}
