package com.demo.shortenurl.service;

import org.springframework.stereotype.Service;

import com.demo.shortenurl.model.Url;
import com.demo.shortenurl.model.UrlDto;

@Service
public interface URLService {
	
	public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public Url getOriginalUrl(String url);
    public  void  deleteShortLink(Url url);

}
