interface MediaPlayer{
    void play();
    void pause();
    void stop();
    void sub();
    void playback();
}


class AudioPlayer implements MediaPlayer{
        
    public void play(){
        System.out.println("Audio is Playing");
    }
    public void pause(){
        System.out.println("Audio Paused");
    }
    public void stop(){
        System.out.println("Audio Stopped");
    }
    public void sub(){
        System.out.println("Subtitles Enabled");
    }
    public void playback(){
        System.out.println("Playback Speed is 1x");
    }
}
class VideoPlayer implements MediaPlayer{
    public void play(){
        System.out.println("Video is Playing");
    }
    public void pause(){
        System.out.println("Video Paused");
    }
    public void stop(){
        System.out.println("Video Stopped");
    }
    public void sub(){
        System.out.println("Subtitles Enabled");
    }
    public void playback(){
        System.out.println("Playback Speed is 1x");
    }
}
class StreamingPlayer implements MediaPlayer{
    public void play(){
        System.out.println("Streaming...");
    }
    public void pause(){
        System.out.println("Paused");
    }
    public void stop(){
        System.out.println("Stopped");
    }
    public void sub(){
        System.out.println("Subtitles Enabled");
    }
    public void playback(){
        System.out.println("Playback Speed is 1x");
    }
}

public class VideoPlayerInterface
{
	public static void main(String[] args) {
		AudioPlayer a = new AudioPlayer();
		VideoPlayer v = new VideoPlayer();
		StreamingPlayer s = new StreamingPlayer();
		a.play();a.pause();a.stop();
		v.play();v.pause();v.stop();v.sub();v.playback();
		s.play();s.pause();s.stop();s.sub();s.playback();
	}
}