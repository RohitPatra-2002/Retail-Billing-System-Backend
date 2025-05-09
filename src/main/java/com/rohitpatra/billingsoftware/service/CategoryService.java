package com.rohitpatra.billingsoftware.service;

import com.rohitpatra.billingsoftware.io.CategoryRequest;
import com.rohitpatra.billingsoftware.io.CategoryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request, MultipartFile file) throws IOException;

    List<CategoryResponse> read();

    void delete(String categoryId);
}
