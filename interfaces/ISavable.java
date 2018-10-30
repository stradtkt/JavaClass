package interfaces_challenge;

import java.util.ArrayList;

public interface ISavable {
	ArrayList<String> write();
	void read(ArrayList<String> savedValues);
}
