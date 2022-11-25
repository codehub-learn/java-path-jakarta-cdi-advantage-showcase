package gr.codelearn.javapathjakartacdiadvantageshowcase.service;

import gr.codelearn.javapathjakartacdiadvantageshowcase.domain.Video;
import gr.codelearn.javapathjakartacdiadvantageshowcase.qualifier.MKV;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.RequestScoped;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@RequestScoped
@Slf4j
@MKV
public class MkvVideoEditorServiceImpl implements VideoEditorService{
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
        return "Editing MKV video: " + videoFile;
    }

    @Override
    public String save(Video videoFile) {
        videoFile.setSizeGb(videoFile.getSizeGb().add(new BigDecimal("5")));
        return "Saving MKV video: " + videoFile;
    }
}
