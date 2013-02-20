package jp.ktsystem.ambitious.designpattern.proxy;

public class ProxyClass implements IfOriginalClass {

	public void exec(int i) {

		// We can do some process before original process.

		OriginalClass c = new OriginalClass();
		c.exec(i);

		// We can do some process after original process.
	}

}
