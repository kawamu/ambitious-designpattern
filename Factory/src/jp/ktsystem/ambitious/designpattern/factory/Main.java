package jp.ktsystem.ambitious.designpattern.factory;

import jp.ktsystem.ambitious.designpattern.bean.AbstractClass;

/**
 * <h1>Main class</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/17
 */
public class Main {

	public static void main(String[] argus) {

		AbstractClass classForProcess = FactoryClass.create(1);

		classForProcess.commonProcess();
	}

}
