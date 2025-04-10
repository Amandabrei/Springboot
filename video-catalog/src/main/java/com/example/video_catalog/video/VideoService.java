package com.example.video_catalog.video;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;

    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Video getVideoById(Long id) {
        return videoRepository.findById(id).orElse(null);
    }

    public Video saveVideo(Video video) {
        return videoRepository.save(video);
    }

    public void deleteVideo(Long id) {
        videoRepository.deleteById(id);
    }

//    @Component
//public class TesteDB implements CommandLineRunner {

//    @Autowired
//    private VideoRepository videoRepository;

//   @Override
//    public void run(String... args) throws Exception {
//        Video video = new Video();
//        video.setName("Boneco Assassino");
//        video.setDescription("O Boneco está possuído");
//        video.setCategory("Terror");
//        video.setUrl("http://url5-do-video.com");
//        video.setReleaseDate("2024-03-03");
//        video.setAgeRating("PG-13");
//        video.setDuration("150");
//       video.setCoverImage("http://url5-do-video.com");
//        videoRepository.save(video);
//        System.out.println("Video salvo com sucesso!"); -->
//    }
//}  socorooooooo Deusssssssss

}
