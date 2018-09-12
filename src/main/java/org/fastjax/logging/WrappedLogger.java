/* Copyright (c) 2018 FastJAX
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * You should have received a copy of The MIT License (MIT) along with this
 * program. If not, see <http://opensource.org/licenses/MIT/>.
 */

package org.fastjax.logging;

import org.slf4j.Logger;
import org.slf4j.Marker;

public class WrappedLogger implements Logger {
  private final Logger logger;

  public WrappedLogger(final Logger logger) {
    this.logger = logger;
  }

  @Override
  public String getName() {
    return logger.getName();
  }

  @Override
  public boolean isTraceEnabled() {
    return logger.isTraceEnabled();
  }

  @Override
  public void trace(final String msg) {
    logger.trace(msg);
  }

  @Override
  public void trace(final String format, final Object arg) {
    logger.trace(format, arg);
  }

  @Override
  public void trace(final String format, final Object arg1, final Object arg2) {
    logger.trace(format, arg1, arg2);
  }

  @Override
  public void trace(final String format, final Object ... arguments) {
    logger.trace(format, arguments);
  }

  @Override
  public void trace(final String msg, final Throwable t) {
    logger.trace(msg, t);
  }

  @Override
  public boolean isTraceEnabled(final Marker marker) {
    return logger.isTraceEnabled(marker);
  }

  @Override
  public void trace(final Marker marker, final String msg) {
    logger.trace(marker, msg);
  }

  @Override
  public void trace(final Marker marker, final String format, final Object arg) {
    logger.trace(marker, format, arg);
  }

  @Override
  public void trace(final Marker marker, final String format, final Object arg1, final Object arg2) {
    logger.trace(marker, format, arg1, arg2);
  }

  @Override
  public void trace(final Marker marker, final String format, final Object ... argArray) {
    logger.trace(marker, format, argArray);
  }

  @Override
  public void trace(final Marker marker, final String msg, final Throwable t) {
    logger.trace(marker, msg, t);
  }

  @Override
  public boolean isDebugEnabled() {
    return isDebugEnabled();
  }

  @Override
  public void debug(final String msg) {
    logger.debug(msg);
  }

  @Override
  public void debug(final String format, final Object arg) {
    logger.debug(format, arg);
  }

  @Override
  public void debug(final String format, final Object arg1, final Object arg2) {
    logger.debug(format, arg1, arg2);
  }

  @Override
  public void debug(final String format, final Object ... arguments) {
    logger.debug(format, arguments);
  }

  @Override
  public void debug(final String msg, final Throwable t) {
    logger.debug(msg, t);
  }

  @Override
  public boolean isDebugEnabled(final Marker marker) {
    return logger.isDebugEnabled(marker);
  }

  @Override
  public void debug(final Marker marker, final String msg) {
    logger.debug(marker, msg);
  }

  @Override
  public void debug(final Marker marker, final String format, final Object arg) {
    logger.debug(marker, format, arg);
  }

  @Override
  public void debug(final Marker marker, final String format, final Object arg1, final Object arg2) {
    logger.debug(marker, format, arg1, arg2);
  }

  @Override
  public void debug(final Marker marker, final String format, final Object ... arguments) {
    logger.debug(marker, format, arguments);
  }

  @Override
  public void debug(final Marker marker, final String msg, final Throwable t) {
    logger.debug(marker, msg, t);
  }

  @Override
  public boolean isInfoEnabled() {
    return logger.isInfoEnabled();
  }

  @Override
  public void info(final String msg) {
    logger.info(msg);
  }

  @Override
  public void info(final String format, final Object arg) {
    logger.info(format, arg);
  }

  @Override
  public void info(final String format, final Object arg1, final Object arg2) {
    logger.info(format, arg1, arg2);
  }

  @Override
  public void info(final String format, final Object ... arguments) {
    logger.info(format, arguments);
  }

  @Override
  public void info(final String msg, final Throwable t) {
    logger.info(msg, t);
  }

  @Override
  public boolean isInfoEnabled(final Marker marker) {
    return logger.isInfoEnabled(marker);
  }

  @Override
  public void info(final Marker marker, final String msg) {
    logger.info(marker, msg);
  }

  @Override
  public void info(final Marker marker, final String format, final Object arg) {
    logger.info(marker, format, arg);
  }

  @Override
  public void info(final Marker marker, final String format, final Object arg1, final Object arg2) {
    logger.info(marker, format, arg1, arg2);
  }

  @Override
  public void info(final Marker marker, final String format, final Object ... arguments) {
    logger.info(marker, format, arguments);
  }

  @Override
  public void info(final Marker marker, final String msg, final Throwable t) {
    logger.info(marker, msg);
  }

  @Override
  public boolean isWarnEnabled() {
    return logger.isWarnEnabled();
  }

  @Override
  public void warn(final String msg) {
    logger.warn(msg);
  }

  @Override
  public void warn(final String format, final Object arg) {
    logger.warn(format, arg);
  }

  @Override
  public void warn(final String format, final Object ... arguments) {
    logger.warn(format, arguments);
  }

  @Override
  public void warn(final String format, final Object arg1, final Object arg2) {
    logger.warn(format, arg1, arg2);
  }

  @Override
  public void warn(final String msg, final Throwable t) {
    logger.warn(msg, t);
  }

  @Override
  public boolean isWarnEnabled(final Marker marker) {
    return isWarnEnabled(marker);
  }

  @Override
  public void warn(final Marker marker, final String msg) {
    logger.warn(marker, msg);
  }

  @Override
  public void warn(final Marker marker, final String format, final Object arg) {
    logger.warn(marker, format, arg);
  }

  @Override
  public void warn(final Marker marker, final String format, final Object arg1, final Object arg2) {
    logger.warn(marker, format, arg1, arg2);
  }

  @Override
  public void warn(final Marker marker, final String format, final Object ... arguments) {
    logger.warn(marker, format, arguments);
  }

  @Override
  public void warn(final Marker marker, final String msg, final Throwable t) {
    logger.warn(marker, msg);
  }

  @Override
  public boolean isErrorEnabled() {
    return logger.isErrorEnabled();
  }

  @Override
  public void error(final String msg) {
    logger.error(msg);
  }

  @Override
  public void error(final String format, final Object arg) {
    logger.error(format, arg);
  }

  @Override
  public void error(final String format, final Object arg1, final Object arg2) {
    logger.error(format, arg1, arg2);
  }

  @Override
  public void error(final String format, final Object ... arguments) {
    logger.error(format, arguments);
  }

  @Override
  public void error(final String msg, final Throwable t) {
    logger.error(msg, t);
  }

  @Override
  public boolean isErrorEnabled(final Marker marker) {
    return logger.isErrorEnabled(marker);
  }

  @Override
  public void error(final Marker marker, final String msg) {
    logger.error(marker, msg);
  }

  @Override
  public void error(final Marker marker, final String format, final Object arg) {
    logger.error(marker, format, arg);
  }

  @Override
  public void error(final Marker marker, final String format, final Object arg1, final Object arg2) {
    logger.error(marker, format, arg1, arg2);
  }

  @Override
  public void error(final Marker marker, final String format, final Object ... arguments) {
    logger.error(marker, format, arguments);
  }

  @Override
  public void error(final Marker marker, final String msg, final Throwable t) {
    logger.error(marker, msg);
  }
}