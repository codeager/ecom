/*
 * Copyright 2018 Jiupeng Zhang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codeager.ecom.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.codeager.ecom.dao.mapper.QuoteRequestMapper;
import com.codeager.ecom.domain.QuoteRequest;
import com.codeager.ecom.service.QuoteAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jiupeng Zhang
 * @since 01/03/2018
 */
@Service
public class QuoteAdminServiceImpl implements QuoteAdminService {
    private QuoteRequestMapper quoteRequestMapper;

    @Override
    public Page<QuoteRequest> getAll(int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize, true).doSelectPage(() -> quoteRequestMapper.selectAll());
    }

    @Override
    public void delete(long contactId) {
        quoteRequestMapper.softDeleteById(contactId);
    }

    @Autowired
    public void setQuoteRequestMapper(QuoteRequestMapper quoteRequestMapper) {
        this.quoteRequestMapper = quoteRequestMapper;
    }
}
