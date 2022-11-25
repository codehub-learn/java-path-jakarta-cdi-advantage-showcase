package gr.codelearn.javapathjakartacdiadvantageshowcase.service;

import gr.codelearn.javapathjakartacdiadvantageshowcase.domain.Video;
import jakarta.enterprise.context.ApplicationScoped;

import java.math.BigDecimal;

@ApplicationScoped
public class Mp4VideoEditorServiceImpl implements VideoEditorService {
    private Integer randomViews = (int) (Math.random() * 10_000) + 100;

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
