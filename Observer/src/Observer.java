interface Observer {
	public void update(Subject s);
	public void detach(Subject s);
}