# Swagger/OpenAPI Documentation - Complete Setup Guide

## 📋 Documentation Index

Welcome! Your Spring Boot Orders API now has full Swagger/OpenAPI documentation support. Here's where to find everything:

### Quick Navigation

| Document | Purpose | Read Time |
|----------|---------|-----------|
| **[QUICK_START.md](./QUICK_START.md)** | Get started in 5 minutes | ⏱️ 5 min |
| **[CHANGES_SUMMARY.md](./CHANGES_SUMMARY.md)** | See what was changed | ⏱️ 10 min |
| **[SWAGGER_SETUP.md](./SWAGGER_SETUP.md)** | Complete setup reference | ⏱️ 15 min |
| **[OPENAPI_EXAMPLES.md](./OPENAPI_EXAMPLES.md)** | Code examples for common patterns | ⏱️ 20 min |

---

## 🚀 Getting Started (30 seconds)

### 1. Start the Application
```bash
cd D:\ProgramacionReactiva\orders
mvn spring-boot:run
```

### 2. Open Swagger UI
```
http://localhost:8080/swagger-ui.html
```

### 3. Test an Endpoint
- Click on "GET /api/products"
- Click "Try it out"
- Click "Execute"
- See the response!

---

## 📚 What Was Done?

### Dependencies Added
- ✅ `springdoc-openapi-starter-webflux-ui` v2.3.0

### Files Modified
- ✅ `pom.xml` - Added OpenAPI dependency
- ✅ `application.yaml` - Added Swagger configuration
- ✅ `ProductController.java` - Added OpenAPI annotations
- ✅ `ProductControllerImpl.java` - Fixed endpoint mapping
- ✅ `ProductDto.java` - Added schema documentation

### Files Created
- ✅ `OpenApiConfig.java` - OpenAPI configuration bean
- ✅ `QUICK_START.md` - Quick start guide
- ✅ `CHANGES_SUMMARY.md` - What changed and why
- ✅ `SWAGGER_SETUP.md` - Complete setup guide
- ✅ `OPENAPI_EXAMPLES.md` - Code examples
- ✅ `README.md` - This file

---

## 🔗 Access Points

### 1. Swagger UI (Interactive)
```
http://localhost:8080/swagger-ui.html
```
**Best for:** Testing APIs, exploring endpoints interactively

### 2. OpenAPI JSON Specification
```
http://localhost:8080/v3/api-docs
```
**Best for:** Importing to Postman, Insomnia, or documentation generators

### 3. OpenAPI YAML Specification
```
http://localhost:8080/v3/api-docs.yaml
```
**Best for:** Human-readable format, version control

---

## 📖 Key Concepts

### What is OpenAPI?
A standard for describing REST APIs using a machine-readable format. Think of it as a blueprint for your API.

### What is Swagger UI?
A web-based tool that reads OpenAPI specifications and provides an interactive interface to explore and test APIs.

### How it Works
1. You annotate your code with `@Operation`, `@Schema`, etc.
2. SpringDoc reads these annotations at startup
3. Swagger UI displays the documentation dynamically
4. API clients can use the OpenAPI JSON for integration

---

## 🔄 Current API Structure

### Available Endpoints

#### Get All Products
```
GET /api/products
```
**Description:** Retrieve all available products

**Response:**
```json
[
  {
    "name": "Laptop",
    "description": "High-performance laptop with 16GB RAM",
    "price": 999.99,
    "stock": 50
  }
]
```

---

## 💡 Next Steps

### Step 1: Explore the Documentation
- [ ] Start the application (`mvn spring-boot:run`)
- [ ] Open Swagger UI (`http://localhost:8080/swagger-ui.html`)
- [ ] Test the `/api/products` endpoint
- [ ] View the OpenAPI spec (`http://localhost:8080/v3/api-docs`)

### Step 2: Understand the Setup
- [ ] Read [QUICK_START.md](./QUICK_START.md) for overview
- [ ] Review [CHANGES_SUMMARY.md](./CHANGES_SUMMARY.md) for what changed
- [ ] Study [SWAGGER_SETUP.md](./SWAGGER_SETUP.md) for detailed configuration

### Step 3: Learn to Add Documentation
- [ ] Review [OPENAPI_EXAMPLES.md](./OPENAPI_EXAMPLES.md) for code patterns
- [ ] Add documentation to new endpoints
- [ ] Use `@Operation`, `@Schema`, `@ApiResponse` annotations

### Step 4: Customize (Optional)
- [ ] Edit `OpenApiConfig.java` to change API metadata
- [ ] Add authentication schemes (OAuth2, API Key, etc.)
- [ ] Configure additional Swagger UI properties in `application.yaml`

---

## 📚 Documentation Structure

```
orders/
├── README.md (this file)                    ← Overview and navigation
├── QUICK_START.md                           ← Fast getting started guide
├── CHANGES_SUMMARY.md                       ← What changed and why
├── SWAGGER_SETUP.md                         ← Complete setup reference
├── OPENAPI_EXAMPLES.md                      ← Code examples
│
├── pom.xml (modified)                       ← Dependencies
├── src/main/resources/application.yaml (modified) ← Configuration
│
└── src/main/java/com/example/orders/
    ├── infrastructure/
    │   ├── config/
    │   │   └── OpenApiConfig.java (NEW)     ← OpenAPI configuration
    │   └── in/rest/
    │       ├── ProductController.java (modified)
    │       ├── ProductControllerImpl.java (modified)
    │       └── dto/
    │           └── ProductDto.java (modified)
    │
    ├── application/usecase/
    ├── domain/entities/
    └── domain/ports/
```

---

## 🛠️ Common Tasks

### See what endpoints are available
```
→ Open Swagger UI: http://localhost:8080/swagger-ui.html
```

### Test an endpoint
```
1. Open Swagger UI
2. Find your endpoint
3. Click "Try it out"
4. Fill in parameters (if any)
5. Click "Execute"
```

### Import to Postman
```
1. Go to http://localhost:8080/v3/api-docs
2. Copy the JSON
3. In Postman: File → Import → Paste Raw Data
4. Create a new collection from the imported spec
```

### Export documentation
```
1. Download OpenAPI JSON: http://localhost:8080/v3/api-docs
2. Or download YAML: http://localhost:8080/v3/api-docs.yaml
3. Use with documentation generators like ReDoc
```

### Add a new endpoint with documentation
```
1. See examples in OPENAPI_EXAMPLES.md
2. Use @Operation, @ApiResponse, @Schema annotations
3. Rebuild: mvn clean install
4. Documentation updates automatically!
```

---

## 🔍 Troubleshooting

### Swagger UI not loading?
- ✅ Ensure application is running (`mvn spring-boot:run`)
- ✅ Check port is 8080 (or configured differently)
- ✅ Verify `springdoc.swagger-ui.enabled: true` in application.yaml

### Endpoints not showing?
- ✅ Ensure controller has `@RestController` annotation
- ✅ Ensure methods have `@GetMapping`, `@PostMapping`, etc.
- ✅ Check that package is scanned by Spring
- ✅ Rebuild project: `mvn clean install`

### Getting ClassNotFoundException?
- ✅ Run `mvn clean install` to rebuild
- ✅ Check all dependencies are downloaded
- ✅ See [SWAGGER_SETUP.md](./SWAGGER_SETUP.md) troubleshooting section

### Documentation not updating?
- ✅ Restart the application
- ✅ SpringDoc generates docs at startup, not dynamically
- ✅ Clear browser cache or use incognito mode

---

## 📖 External Resources

### Official Documentation
- **[SpringDoc OpenAPI](https://springdoc.org/)** - Official SpringDoc documentation
- **[OpenAPI 3.0 Spec](https://spec.openapis.org/oas/v3.0.3)** - OpenAPI specification
- **[Swagger UI](https://swagger.io/tools/swagger-ui/)** - Swagger UI documentation

### Tools & Integrations
- **[Postman](https://www.postman.com/)** - API testing tool (import OpenAPI)
- **[Insomnia](https://insomnia.rest/)** - API client (import OpenAPI)
- **[ReDoc](https://redoc.ly/)** - API documentation generator

---

## ✅ Verification Checklist

- [x] SpringDoc OpenAPI dependency added
- [x] OpenAPI configuration bean created
- [x] Swagger UI enabled in application.yaml
- [x] Controllers annotated with @Operation
- [x] DTOs annotated with @Schema
- [x] Project builds successfully
- [x] Swagger UI accessible at `/swagger-ui.html`
- [x] OpenAPI spec available at `/v3/api-docs`

---

## 🎯 Quick Reference Commands

```bash
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run

# Build with tests skipped
mvn clean install -DskipTests

# View build info
mvn version

# Check dependencies
mvn dependency:tree
```

## 🌐 Access URLs (when app is running)

| Resource | URL |
|----------|-----|
| Swagger UI | http://localhost:8080/swagger-ui.html |
| OpenAPI JSON | http://localhost:8080/v3/api-docs |
| OpenAPI YAML | http://localhost:8080/v3/api-docs.yaml |
| Application | http://localhost:8080/ |

---

## 📝 Notes

- This setup uses **SpringDoc OpenAPI** (the recommended library)
- Supports **Spring Boot 4.x** with **WebFlux** (reactive)
- Compatible with **Java 25**
- OpenAPI **3.0** specification
- **Auto-generated** from code annotations
- **Zero runtime overhead** after startup

---

## 🤝 Need Help?

1. **Quick answer?** → Check [QUICK_START.md](./QUICK_START.md)
2. **Setup details?** → See [SWAGGER_SETUP.md](./SWAGGER_SETUP.md)
3. **Code examples?** → Review [OPENAPI_EXAMPLES.md](./OPENAPI_EXAMPLES.md)
4. **What changed?** → Read [CHANGES_SUMMARY.md](./CHANGES_SUMMARY.md)
5. **Official docs?** → Visit https://springdoc.org/

---

## 🎉 You're All Set!

Your API now has professional API documentation. Start by:

1. Running the application
2. Opening Swagger UI
3. Testing your endpoints
4. Adding more endpoints with documentation

Happy API documenting! 🚀

---

**Last Updated:** March 2, 2026
**SpringDoc Version:** 2.3.0
**Spring Boot Version:** 4.0.3
**Java Version:** 25

