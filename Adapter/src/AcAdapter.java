class AcAdapter implements Dengen {
	private JapaneseConsent japaneseconsent = new JapaneseConsent();
	public int kyuuden() {
		return japaneseconsent.power();
	}
}