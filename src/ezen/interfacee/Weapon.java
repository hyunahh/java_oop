package ezen.interfacee;

/**
 * 유닛이 사용하는 모든 무기들에 대한 표준 규약(명세) 인터페이스 - 역할 인터페이스는 100% 추상메소드만 구성된다.
 * 
 * @author 김현아
 * @date 2023. 1. 6.
 */
public interface Weapon {
	/* public static final */ int WEIGHT = 1;

	public /* abstract */ void attack();

}
