package com.github.linkeer8802.octopus.example.book.infrastructure.common.model.event;

import com.github.linkeer8802.octopus.core.DomainEvent;
import com.github.linkeer8802.octopus.example.book.domain.book.BookStatus;
import lombok.ToString;

@ToString(callSuper = true)
public class BookReturnedEvent extends DomainEvent {

    public final BookStatus status;

    public BookReturnedEvent(BookStatus status) {
        this.status = status;
    }
}
