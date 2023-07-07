package nested_class;

public class Fackebook {
	
	static final int SHORT_VIDEO=24;
	static final boolean LONG_VIDEO =true;
	
	private String title;
	private String format;
	
	static class VideoUploader{
		public VideoUploader() {
			// TODO Auto-generated constructor stub
		
			System.out.println("Video Uploader No arg constructor is invoted "+this);
		}
		
		void upload(String title, String format) {
//			Fackebook facebook = new Fackebook("Fun.mp4","mp4");
			
			System.out.println("short video Limit :"+SHORT_VIDEO);
			System.out.println("Long Video Limet :"+LONG_VIDEO);
			System.out.println("Facebook video is Uploaded");
			System.out.println("Video Title :"+title);
			System.out.println("Format :"+format);

		}
	}
	
	public Fackebook() {
		// TODO Auto-generated constructor stub
	}

	public Fackebook(String title, String format) {
		super();
		this.title = title;
		this.format = format;
	}
	
	public void upload() {
		VideoUploader uploader = new VideoUploader();
		uploader.upload(title, format);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public static int getShortVideo() {
		return SHORT_VIDEO;
	}

	public static boolean isLongVideo() {
		return LONG_VIDEO;
	}

	
}
