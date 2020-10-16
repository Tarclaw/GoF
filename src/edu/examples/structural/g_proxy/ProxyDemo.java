package edu.examples.structural.g_proxy;

import edu.examples.structural.g_proxy.downloader.YouTubeDownloader;
import edu.examples.structural.g_proxy.media_library.ThirdPartyYouTubeClass;
import edu.examples.structural.g_proxy.proxy.YouTubeCacheProxy;

/**
 * Some examples of proxies in standard Java libraries: *
 *     java.lang.reflect.Proxy
 *     java.rmi.*
 *     javax.ejb.EJB (see comments)
 *     javax.inject.Inject (see comments)
 *     javax.persistence.PersistenceContext *
 * Identification: Proxies delegate all of the real work to some other object. Each proxy method should, in the end,
 * refer to a service object unless the proxy is a subclass of a service.
 */
public class ProxyDemo {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
