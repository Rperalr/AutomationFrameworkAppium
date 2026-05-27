package videoRecorder;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.AudioFormatKeys.EncodingKey;
import static org.monte.media.AudioFormatKeys.FrameRateKey;
import static org.monte.media.AudioFormatKeys.KeyFrameIntervalKey;
import static org.monte.media.AudioFormatKeys.MIME_AVI;
import static org.monte.media.AudioFormatKeys.MediaType;
import static org.monte.media.AudioFormatKeys.MediaTypeKey;
import static org.monte.media.AudioFormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

public class VideoRecorder extends ScreenRecorder {

    /**
     * A static variable to hold an instance of the ScreenRecorder.
     * This can be used to manage screen recording operations such as starting,
     * stopping, and saving recordings.
     */
    public static ScreenRecorder screenRecorder;
    public static String name;

    /**
     * Constructs a new VideoRecorder instance with the specified graphics configuration
     * and output file. This recorder is configured to capture video using the
     * TechSmith Screen Capture codec and save it in AVI format.
     *
     * @param "cfg"  The graphics configuration that determines the screen area to record.
     * @param //file The file where the recorded video will be saved.
     * @throws IOException  If an I/O error occurs while initializing the recorder.
     * @throws AWTException If the platform configuration does not allow low-level input control.
     */
    public VideoRecorder(GraphicsConfiguration cfg, File file) throws IOException, AWTException {
        super(cfg, cfg.getBounds(),
                        new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
                        new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                                CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                                DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                                QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
                        new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
                                FrameRateKey, Rational.valueOf(30)),
                        null, file);
        VideoRecorder.name = name;
    }

    /**
     * Starts recording the screen and saves the video to the specified directory.
     *
     * @throws Exception if an error occurs during the recording process.
     */
    public static void startRecording() throws Exception {
        File file = new File("./evidences/videos/");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle captureSize = new Rectangle(0, 0, screenSize.width, screenSize.height);
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getDefaultScreenDevice().getDefaultConfiguration();

        screenRecorder = new VideoRecorder(gc, file);
        screenRecorder.start();
    }

    /**
     * Stops the screen recording session.
     *
     * @throws Exception if an error occurs while stopping the screen recorder.
     */
    public static void stopRecording() throws Exception {
        screenRecorder.stop();
    }
}
