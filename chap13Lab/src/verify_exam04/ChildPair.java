package verify_exam04;

/*** [ChildPair.java] 제네릭 타입 상속 ***/

public class ChildPair<K, V> extends Pair<K, V> {
	public ChildPair(K k, V v) {
		super(k, v);
	}
}