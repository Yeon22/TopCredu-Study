package ����_20180117;

public class Project_20180117 {
	
	/*
	 * 1. employees���� ��ȭ��ȣ�� 515-333-444 �������� ����Ͻÿ�.
    	select replace(phone_number, '.', '-') "��ȭ��ȣ"
    	from employees;
    
    
		2. 2005�⿡ �Ի��� �������� ����Ͻÿ�.
    	select first_name, hire_date
    	from employees
    	where hire_date between '2005/01/01' and '2005/12/31'
    	order by hire_date;

	3. manager���� �������� ���ڸ� ī��Ʈ �Ͻÿ�.
    	select manager_id, count(*) "�������� ��"
    	from employees
    	group by manager_id;

	4. 3���� ������� �������� ���ڰ� 3�� �̻��� ��츸 ����Ͻÿ�.
    	select manager_id, count(*)
    	from employees
    	having count(*) >= 3
    	group by manager_id
    	order by manager_id;

	5. ������, �ٹ��ϴ� �������� ����Ͻÿ�. => ��� ���̺��� �����ؾ� ���� ����غ�����.
    	select e.first_name, e.last_name, c.country_name
    	from employees e join departments d
    	on e.department_id = d.department_id
    	join locations l
    	on d.location_id = l.location_id
    	join countries c
    	on l.country_id = c.country_id;
	 */

}
