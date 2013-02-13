package jp.ktsystem.ambitious.designpattern.singleton;

/**
 * <h1>Main class</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/17
 */
public class Main {

	public static void main(String[] argus) {

		// Cannot new SingletonClass();
		SingletonClass.getInstance().execute();
	}

}
