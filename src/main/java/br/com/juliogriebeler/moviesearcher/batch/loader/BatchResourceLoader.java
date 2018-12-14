/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.batch.loader;

import java.io.IOException;
import java.io.InputStream;

import org.apache.lucene.util.IOUtils;

/**
 * @author Julio
 *
 */
 
public class BatchResourceLoader {
    public static String loadResourceToString(final String path) {
        final InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
        try {
            return IOUtils.toString(stream, "UTF-8");
        } catch (final IOException e) {
            throw new IllegalStateException(e);
        } finally {
            IOUtils.closeQuietly(stream);
        }
    }
}