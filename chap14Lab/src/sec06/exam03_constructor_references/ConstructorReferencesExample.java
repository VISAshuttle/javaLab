package sec06.exam03_constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		// �͸� ���� ��ü
		Function<String, Member> functionAnonymous = new Function<String, Member>() {
			@Override
			public Member apply(String t) {
				return new Member(t);
			}
		};
		Member member1 = functionAnonymous.apply("angel");
		
		// ���ٽ�
		Function<String, Member> functionLambda = t -> new Member(t);
		Member member2 = functionLambda.apply("angel");
		
		// ������ ����
		Function<String, Member> function1 = Member :: new;
		Member member3 = function1.apply("angel");
		
		// ������ ���� (�Ű����� 2��)
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member4 = function2.apply("��õ��", "angel");
	}
}
