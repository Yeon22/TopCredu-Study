package SQL_Oracle;

public class ����_20180118 {

	/*
	 * create table t_order
		( 
		  no NUMBER,
		  ord_code VARCHAR2(10),
		  ord_date DATE
		);
		
		CREATE OR REPLACE TRIGGER t_order
		BEFORE INSERT ON t_order
		BEGIN
		    IF(TO_CHAR(SYSDATE,'HH24:MI') NOT BETWEEN '18:40' AND '18:50') THEN
		        RAISE_APPLICATION_ERROR(-20100,'���ð��� �ƴմϴ�.');
		    END IF;
		END;
		/
		
		select sysdate from dual;
		
		insert into t_order values(1,'C100',SYSDATE);
		
		
		CREATE OR REPLACE TRIGGER t_order2
		  BEFORE INSERT ON t_order
		  FOR EACH ROW   --�� trigger ����
		BEGIN
		    IF(:NEW.ord_code) NOT IN ('C100') THEN
		        RAISE_APPLICATION_ERROR(-20200,'��ǰ�ڵ尡 Ʋ���ϴ�.!');
		    END IF;
		END;
		/
		
		SELECT * FROM t_order;
		
		DROP TRIGGER T_ORDER;
		
		INSERT INTO t_order VALUES (3,'C100',SYSDATE);
		
		
		CREATE OR REPLACE TRIGGER t_order3
		BEFORE INSERT ON t_order
		  FOR EACH ROW
		  WHEN ( NEW.ord_code = 'C500')
		  BEGIN
		      IF(TO_CHAR(SYSDATE,'HH24:MI') NOT BETWEEN '14:13' AND '14:23') THEN
		        RAISE_APPLICATION_ERROR(-20300,'C500 ��ǰ�� �Է����ð��� �ƴմϴ�.!');
		      END IF;
		  END;
		/
		
		INSERT INTO t_order values(1,'C500',SYSDATE);
		
		select * from t_order;
		
		DROP TRIGGER t_order2;

	 */
	
}
