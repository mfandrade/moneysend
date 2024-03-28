FROM node:current-alpine
WORKDIR /app

# Copy package.json and package-lock.json first to leverage Docker caching
COPY package.json package-lock.json ./
RUN npm install
COPY . .


ENV PORT=3000
EXPOSE $PORT
# dumb-init node server.js
CMD ["npm", "start"]
