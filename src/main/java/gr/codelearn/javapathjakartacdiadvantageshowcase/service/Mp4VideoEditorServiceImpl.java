package gr.codelearn.javapathjakartacdiadvantageshowcase.service;

import gr.codelearn.javapathjakartacdiadvantageshowcase.domain.Video;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@ApplicationScoped
@Slf4j
public class Mp4VideoEditorServiceImpl implements VideoEditorService {
    private Integer randomViews = (int) (Math.random() * 10_000) + 100;

    @PostConstruct
    private void initialize() {
        log.info("Class {} has been initialized.", getClass().getName());
    }

    @PreDestroy
    private void destroy() {
        log.info("Class {} is being destroyed.", getClass().getName());
    }

    @Override
    public String edit(Video videoFile) {
        videoFile.setViews(randomViews);
        return "Editing MP4 video: " + videoFile;
    }

    @Override
    public String save(Video videoFile) {
        videoFile.setSizeGb(videoFile.getSizeGb().add(new BigDecimal("1.5")));
        return "Saving MP4 video: " + videoFile;
    }
}
