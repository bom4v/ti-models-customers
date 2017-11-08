package org.bom4v.ti.models.customers

/**
 * CustomerModel
 */
object CustomerModel {

  /**
   * Customer details
   */
  case class Customer(
    firstName: String,
    lastName: String,
    customerMSISDN: Option[String]
  )

  /**
   * CustomerUpdateEvent
   */
  case class CustomerUpdateEvent(
    timestamp: org.joda.time.LocalDateTime,
    eventType: String,
    customerMSISDN: Option[String]
  )
}
