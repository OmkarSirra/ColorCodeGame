#!/usr/bin/env bash
docker build -t color-code-image .
docker run color-code-image
