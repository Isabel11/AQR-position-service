package aqr.positioning.file;

import java.io.InputStream;

public interface PositionServiceFileUtil {


	/**
	 * Takes a path to the fills file and returns an open {@link InputStream} to the file if valid.
	 *
	 * @param pathToFillsFile The path to the fills file as a {@link String}.
	 * @return The {@link InputStream} to the file if valid
	 */
	InputStream getFillsStream(String pathToFillsFile);

	/**
	 * Takes a path to the prices file and returns an open {@link InputStream} to the file if valid.
	 *
	 * @param pathToPricesFile The path to the prices file as a {@link String}.
	 * @return The {@link InputStream} to the file if valid
	 */
	InputStream getPricesStream(String pathToPricesFile);
}
