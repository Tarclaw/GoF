package edu.examples.structural.e_facade;

import edu.examples.structural.e_facade.facade.VideoConversionFacade;

import java.io.File;

/**
 * Examples from the real world:
 *  - javax.faces.context.FacesContext uses LifeCycle, ViewHandler, NavigationHandler classes under the hood, but most clients aren’t aware of that.
 *  - javax.faces.context.ExternalContext uses ServletContext, HttpSession, HttpServletRequest, HttpServletResponse and others inside.
 */
public class FacadeDemo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
