package _99_extra;

public class PixelRunner {
	public static void main(String[] args) {

		PixelParty party = new PixelParty();
		party.setColor(50,100,200);
		party.drawRectangle(30, 40, 40, 60);
		party.drawTriangle(50, 50, 133, 133, 25, 133);
		party.drawCircle(300, 520, 55);
		party.drawRectangle(100, 300, 100, 60);
		party.drawTriangle(250, 270, 133, 733, 255, 360);
		party.drawCircle(400, 200, 100);
		party.saveImage();
		party.displayImage();
	}
}
