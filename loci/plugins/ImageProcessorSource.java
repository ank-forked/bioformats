//
// ImageProcessorSource.java
//

/*
LOCI Plugins for ImageJ: a collection of ImageJ plugins including the
Bio-Formats Importer, Bio-Formats Exporter, Bio-Formats Macro Extensions,
Data Browser, Stack Colorizer and Stack Slicer. Copyright (C) 2005-@year@
Melissa Linkert, Curtis Rueden and Christopher Peterson.

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package loci.plugins;

import ij.ImageStack;
import ij.process.ImageProcessor;
import loci.formats.cache.CacheException;
import loci.formats.cache.ICacheSource;

/**
 * Retrieves ImageJ image processors from an ImagePlus object.
 *
 * <dl><dt><b>Source code:</b></dt>
 * <dd><a href="https://skyking.microscopy.wisc.edu/trac/java/browser/trunk/loci/plugins/ImageProcessorSource.java">Trac</a>,
 * <a href="https://skyking.microscopy.wisc.edu/svn/java/trunk/loci/plugins/ImageProcessorSource.java">SVN</a></dd></dl>
 */
public class ImageProcessorSource implements ICacheSource {

  // -- Fields --

  /** ImageStack object from which to draw ImageProcessors. */
  protected ImageStack stack;

  // -- Constructors --

  public ImageProcessorSource(ImageStack stack) throws CacheException {
    this.stack = stack;
  }

  // -- ICacheSource API methods --

  /* @see loci.formats.cache.ICacheSource#getObject(int) */
  public int getObjectCount() { return stack.getSize(); }

  /* @see loci.formats.cache.ICacheSource#getObject(int) */
  public Object getObject(int index) throws CacheException {
    //return new ImageProcessor[] {stack.getProcessor(index)};
    ImageProcessor ip = null;
    /*
    try {
      ip = Util.openProcessors(reader, index)[0];
    }
    catch (FormatException exc) {
      throw new CacheException(exc);
    }
    catch (IOException exc) {
      throw new CacheException(exc);
    }
    */
    return ip;
  }

}
