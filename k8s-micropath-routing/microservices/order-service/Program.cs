var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

app.MapGet("/", () => new { service = "order", status = "running" });
app.MapGet("/health", () => "ok");

app.Run();
