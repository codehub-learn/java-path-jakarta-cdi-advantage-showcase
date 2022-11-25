package gr.codelearn.javapathjakartacdiadvantageshowcase.service;

import gr.codelearn.javapathjakartacdiadvantageshowcase.domain.Video;

public interface VideoEditorService {
    String edit(Video videoFile);
    String save(Video videoFile);
}
