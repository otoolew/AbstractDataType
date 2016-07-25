package lab2;
/**
 *Lab 2 
 *You are going to implement the ADT Simple RGB by creating a class named SimpleRGB. What you
 *have to do is to modify the starting code (SimpleRGB.java). You need to add instance variables,
 *implement the constructor, and implement all methods that marked TO DO.
 *A grey color is a color where red, green, and blue values are exactly the same. To convert an
 *RGB image into a greyscale image, the red, green, and blue values of each pixel must be the same.
 *For example, suppose the red, green, and blue value of the pixel (x,y) are R, G, and B, use the
 *following formula
 *newValue = (0.21 * R) + (0.72 * G) + (0.07 * B)
 *and use the newValue for all red, green, and blue of the grey scale image at (x,y).
 *@author William O'Toole
 */
public class SimpleRGB {
	
	// Instant Variables
	int width;
	int height;
	int coX;
	int coY;
	int red;
	int green;
	int blue;
	
	// Constructor
	public SimpleRGB(int aWidth, int aHeight) {		
		width = aWidth;
		height = aHeight;
		
	}

	/**
	 * Gets the width of this image.
	 * 
	 * @return the width of this image.
	 */
	public int getWidth() {	
		return width;
	}

	/**
	 * Gets the height of this image.
	 * 
	 * @return the height of this image.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the red value at coordinate (x,y) to aRed.
	 * 
	 * @param x
	 *            the x coordinate of this image.
	 * @param y
	 *            the y coordinate of this image.
	 * @param aRed
	 *            the red value (0 - 255)
	 */
	public void setRed(int x, int y, int aRed) {
		coX = x;
		coY = y;
		red = aRed;		
	}

	/**
	 * Sets the green value at coordinate (x,y) to aGreen.
	 * 
	 * @param x
	 *            the x coordinate of this image.
	 * @param y
	 *            the y coordinate of this image.
	 * @param aGreen
	 *            the green value (0 - 255)
	 */
	public void setGreen(int x, int y, int aGreen) {
		coX = x;
		coY = y;
		green = aGreen;
	}

	/**
	 * Sets the blue value at coordinate (x,y) to aBlue.
	 * 
	 * @param x
	 *            the x coordinate of this image.
	 * @param y
	 *            the y coordinate of this image.
	 * @param aBlue
	 *            the blue value (0 - 255)
	 */
	public void setBlue(int x, int y, int aBlue) {
		coX = x;
		coY = y;
		blue = aBlue;
	}

	/**
	 * Gets the red value at coordinate (x,y).
	 * 
	 * @param x
	 *            the x coordinate of this image.
	 * @param y
	 *            the y coordinate of this image.
	 * @return the value of red at coordinate (x,y).
	 */
	public int getRed(int x, int y) {
		return red;
	}

	/**
	 * Gets the green value at coordinate (x,y).
	 * 
	 * @param x
	 *            the x coordinate of this image.
	 * @param y
	 *            the y coordinate of this image.
	 * @return the value of green at coordinate (x,y).
	 */
	public int getGreen(int x, int y) {
		return green;
	}

	/**
	 * Gets the blue value at coordinate (x,y).
	 * 
	 * @param x
	 *            the x coordinate of this image.
	 * @param y
	 *            the y coordinate of this image.
	 * @return the value of blue at coordinate (x,y).
	 */
	public int getBlue(int x, int y) {
		return blue;
	}

	/**
	 * Get the NEW image containing only the red color. The red values of this
	 * new image should be exactly the same as red value of this image. The
	 * green and blue values of this new image should be 0s.
	 * ;
	 * 
	 * @return the NEW image (SimpleRGB) containing only the red color of this
	 *         image.
	 */
	public SimpleRGB getRedImage() {
		// TO DO
		SimpleRGB newImage = new SimpleRGB(width, height);
		newImage.red = this.getRed(coX, coY);
		newImage.setGreen(coX, coY, 0);
		newImage.setBlue(coX, coY, 0);
		return newImage;
		//newValue = (0.21 * R) + (0.72 * G) + (0.07 * B)
	}

	/**
	 * Get the NEW image containing only the green color. The green values of
	 * this new image should be exactly the same as green value of this image.
	 * The red and blue values of this new image should be 0s.
	 * 
	 * @return the NEW image (SimpleRGB) containing only the green color of this
	 *         image.
	 */
	public SimpleRGB getGreenImage() {
		SimpleRGB newImage = new SimpleRGB(width, height);
		newImage.green = this.getGreen(coX, coY);
		newImage.setRed(coX, coY, 0);
		newImage.setBlue(coX, coY, 0);		
		return newImage;
	}

	/**
	 * Get the NEW image containing only the blue color. The blue values of this
	 * new image should be exactly the same as blue value of this image. The red
	 * and green values of this new image should be 0s.
	 * 
	 * @return the NEW image (SimpleRGB) containing only the blue color of this
	 *         image.
	 */
	public SimpleRGB getBlueImage() {
		SimpleRGB newImage = new SimpleRGB(width, height);
		newImage.blue = this.getBlue(coX, coY);
		newImage.setRed(coX, coY, 0);
		newImage.setGreen(coX,coY,0);				
		return newImage;
	}

	/**
	 * Get the NEW image representing the greyscale of this image. The grey
	 * colors are colors that the red, green and blue value are exactly the
	 * same. To convert an RGB image into a greyscale image, use the following
	 * formula to calculate the new value. (0.21 * red) + (0.72 * green) + (0.07
	 * * blue) For example, suppose the (R,G,B) value of this image at
	 * coordinate (10,20) are (10,100,200), since (0.21 * 10) + (0.72 * 100) +
	 * (0.07 * 200) = 88 the (R,G,B) value of the new greyscale image at (10,20)
	 * should be (88,88,88).
	 * 
	 * @return the NEW image representing the greyscale of this image.
	 */
	public SimpleRGB getGreyImage() {
		SimpleRGB newImage = new SimpleRGB(width, height);
		int red = getRed(coX, coY);
		int green = getGreen(coX, coY);
		int blue = getBlue(coX, coY);
		
		Double newValue = (0.21 * red) + (0.72 * green) + (0.07 * blue);
		
		Integer greyValue= newValue.intValue();
		
		newImage.setRed(coX, coY, greyValue);
		newImage.setGreen(coX, coY, greyValue);
		newImage.setBlue(coX, coY, greyValue);
		
		
		return newImage;
	}
}
