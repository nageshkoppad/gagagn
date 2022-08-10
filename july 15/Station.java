class Station
{
	public static void main(String[] nuk)
	{
		Rail.track("bangalore");
		Rail.track(24d);
		Rail.track("bangalore",24);
		Rail.track("bangalore",100000d);
		Rail.track(true);
		Rail.track(true,100000d,"bangalore");
	}
}