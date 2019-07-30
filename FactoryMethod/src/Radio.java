class Radio extends Seihin {
private int radioSerialNumber;
public void numberring() {
radioSerialNumber = Counter.getRadioNumber();
}

public void print() {
	System.out.println("このラジオに関する情報:");
	System.out.println(" 製造番号:" + radioSerialNumber);
	System.out.println("これは"+radioSerialNumber+"番ラジオの情報です");
	System.out.println();
	}
}