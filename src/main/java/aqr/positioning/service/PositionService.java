package aqr.positioning.service;

import java.io.InputStream;

public interface PositionService {

	/**
	 * Prints PNL message for fills and prices.
	 * @param fills An {@link InputStream} to the fills file.
	 * @param prizes An {@link InputStream} to the prices file.
	 */
	void positionService(InputStream fills, InputStream prices);

}
