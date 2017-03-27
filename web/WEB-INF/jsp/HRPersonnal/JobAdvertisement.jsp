<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<!-- Page Heading -->
<div class="row">
    <div class="col-lg-12 col-sm-12">
        <h1 class="page-header">
            Job Advertisement 
        </h1>
    </div>
</div>
<div class="row">
    <div class="col-lg-12 col-sm-12">
        <form id="jobAdForm" action="jobAd" method="post">
            <div class="form-group">
                    <label for="jobTitle">Posting Title</label>
                    <input type="text" name="jobTitle" maxlength="30" class="form-control" id="jobTitle" placeholder="Enter Posting Title" required>
            </div>
            <div class="form-group">
                    <label for="experience">Experience Required </label>
                    <input type="text" name="jobExperience" maxlength="15" class="form-control" id="experience" placeholder="Experience" required>
            </div>
            <div class="form-group">
                    <label for="description">Job Description</label>
                    <textarea maxlength="500" name="jobDescription" class="form-control" rows="5" id="description" placeholder="Enter Job Description" required></textarea>
            </div>
            <button type="submit" class="btn btn-success btn-block">Submit</button>
        </form>
    </div>
</div>
<!-- /.row -->
