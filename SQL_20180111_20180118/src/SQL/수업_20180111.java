package SQL;

public class ����_20180111 {
	
	/*
	 
	--DESC ��ɾ�� �������� �ľ��ϱ�
	DESC employees;  --Ư�� ���̺� � Į���� �ִ��� ��ȸ DESC


	--�����ͺ��̽����� ��ȸ�� �ϴ¹������ ���������.


	--SELECT ��ɾ�� �����͸� ��ȸ�մϴ�.


	--�÷����� ��ȸ�� �� �ִ�.


	--select [�÷��� �Ǵ� ǥ����] from [���̺�� �Ǵ� �� ��];
	select employee_id from employees; 

	select * from employees; --* ���� ��ȸ�ض�


	--�������̵�� email�� �˻��Ͻÿ�.
	select employee_id,email from employees;

	select employee_id , first_name , last_name

	from employees;


	--���ͷ� ���� �̿��غ��� ���ڸ� ���� 1~100  ���ڳ� ���ڿ� 'A' "�ȳ�"
	select employee_id , first_name ,'�ȳ��ϼ���'

	from employees;


	--��� �� �� �÷��� ������ ����Ҽ� �ִ�. ��񿡼� ����ϴ� SQL ���� ���α׷��־���.
	select employee_id "������" , first_name AS "��"

	from employees;

	select first_name , last_name from employees;


	--���� �����ڷ� �÷����� ���δ�.
	select first_name || last_name from employees; --�����͸� ���ļ� ������ �Դ�.

	select first_name ||' '|| last_name from employees;

	select department_id from employees;



	--�ߺ��� ���� �����ϰ� ����ϱ�
	select distinct department_id from employees;

	*/

}
