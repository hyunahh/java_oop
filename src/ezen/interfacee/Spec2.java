package ezen.interfacee;

/**
 * 인터페이스간에도 상속이 가능하며, 거기다가 다중상속까지 가능하다.
 * @author 김현아
 * @date	2023. 1. 6.
 */
public interface Spec2 extends Spec1, Weapon{
	public void doTask3();
}


